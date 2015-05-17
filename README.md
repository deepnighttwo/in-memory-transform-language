# in-memory transfer language

# Introduction

in-memory transfer language (ITL for short) is a SQL-like language to transfer in-memory data.
It is embedded, written in java and consume json or java bean object (so called in-memory).
If familiar with ETL, ITL's function is very similar with the "T" in ETL. That is, to transform structured data.

# What For

Suppose there is a real time data source, it can be a SOA service, a queue or any way that can provide structured data.
And there is a target (could be a SOA service, a queue, a database) which expect data from the source but need some **transformation**.
How to retrieve data from source and how to send data to target is kind of fixed and better to be hard code.

But the transformation is likely to change from time to time to fulfill business requirements: need a new field, need some calculation, need a new filter rule...

Sure you've been there if you ever providing real time data to others. Here comes ITL to handle this kind of tasks a litter easier.

# Examples

## Transform and Filter Resume Data

Suppose input data is like:

```json
{
  "name": "Jim Green",
  "addr": "Shanghai Tangchen yipin No1",
  "workexp": [
    {
      "companyName": "Mobile",
      "position": "Software Developer",
      "workYear": 25
    },
    {
      "companyName": "Baidu",
      "position": "Staff",
      "workYear": 9
    },
    {
      "companyName": "Google",
      "position": "Software Developer",
      "workYear": 20
    }
  ],
  "age": 28,
  "education": "University",
  "income": 15000000,
  "startIncome": 80000,
  "workyear": 5,
  "location": "Shanghai",
  "married": true
}
```

The requirement is accept a resume if and of the following conditions is fulfilled:

 - older than 30 and worked more than 7 years
 - or location is Shanghai
 - or education is doctor

If fulfilled, select

 - some properties from origin data
 - some literal value
 - some simple math calculation based on origin calculation
 - some self-defined java method to calculate a value

The ITL is like this (Please notice that the ITL is trying to show more features and some part is not quite make sense actually.):

```sql
select
     person.name as name,
     upper(person.addr) as addr,
     person.workexp[0] as firstwork,
     isGoodIncome(person.age, person.education, person.income) as isGoodIncome,
     (person.income-person.startIncome)/person.workyear as salaryIncreaseYearly,
     null as furtherData,
     nowStr() as datetime,
     "Phase1" as currStep,
     99 as status,
     'a' as grade,
     98.5 as mark,
     person.married as marriedStatus,
     map on person.workexp (companyName) as mapCompanyName,
     reduce on person.workexp using maxOnFirst(workYear,companyName,position) as maxWorkExp
from PersonData as person
    where (person.age > 30 and person.workyear > 7)
    or person.location="Shanghai"
    or person.education="doctor"
```

After input the json data to the ITL above, the returned data from ITL is:

```json
{
  "name": "Jim Green",
  "addr": "SHANGHAI TANGCHEN YIPIN NO1",
  "firstwork": {
    "companyName": "Mobile",
    "position": "Software Developer",
    "workYear": 25.0
  },
  "isGoodIncome": true,
  "salaryIncreaseYearly": 2984000.0,
  "datetime": "2015-05-17 20:54:26.154",
  "currStep": "Phase1",
  "status": 99,
  "grade": "a",
  "mark": 98.5,
  "marriedStatus": true,
  "mapCompanyName": [
    ["Mobile"],
    ["Baidu"],
    ["Google"]
  ],
  "maxWorkExp": {
    "25.0": [
      25.0,
      "Mobile",
      "Software Developer"
    ]
  }
}
```

Features demonstrated above including

 - Retrieve properties using **dot**
 - Retrieve array/list value using **[index]**
 - Function call (upper, isGoodIncome). upper is default function and isGoodIncome is self-defined
 - Math calculation expression
 - Select literal value
 - Calculation expression
 - Boolean expression
 - Using select to retrieve fields
 - Using as to specify alias name for field
 - Using from to define alias for data source
 - Using where to filter data (will return null if where statement is not fulfilled)
 - Using map and reduce to process array data

## Transform and Filter Order Data

Suppose a datasource provide realtime order data as follow:

```json
{
  "orderId": "2015-05-10-11:59-878929384981",
  "totalPrice": 981.5,
  "datetime": 1431230460766,
  "customerId": "DeepNightTwo",
  "ip": "1.2.3.4",
  "location": "Shanghai",
  "ref": "google-search",
  "payTypes": {
    "creditCard": 900.0,
    "prePaidAccount": 80.0,
    "memberPoint": 1.5
  },
  "transferCost": 5.0,
  "items": [
    {
      "sku": "B00CY3UZ38",
      "amount": 2,
      "cost": 50,
      "price": 69,
      "name": "Devondale Milk imported from Australia",
      "type": "buy"
    },
    {
      "sku": "B00PTBGE96",
      "amount": 1,
      "cost": 300,
      "price": 499,
      "name": "Kindle Reader DS Version",
      "type": "buy"
    },
    {
      "sku": "B00USP7V7C",
      "amount": 1,
      "cost": 230,
      "price": 344.5,
      "name": "NIKE REVOLUTION 2 MSL 554954",
      "type": "buy"
    }
  ]
}
```

The requirement is select some properties only when a order actually earns money. That is total price - total cost - trans expense > 0

the ITL is like:

```SQL
select
     order.orderId as orderId,
     timeStr(order.datetime) as datetime,
     order.ip as ip,
     upper(order.location) as location,
     order.ref as ref
from OrderData as order
where
     (reduce on order.items using sum(amount*(price-cost)) - order.transferCost) > 0
```

The key is using reduce and sum function to calculate and check if a order actually earn money.

These two examples above show all main features supported by ITL. There is an main application in this project to run the two ITL in this project called DemoAppMain

Source code is:

```java
package com.dnt.itl;

import com.dnt.itl.ext.ExtensionFunction;
import com.dnt.itl.parser.ITLExplainService;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class DemoAppMain {

    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        runOrder();
        runResume();
    }

    static void runOrder() throws NoSuchMethodException {
        Map data = gson.fromJson(new InputStreamReader(DemoAppMain.class.getResourceAsStream("/order.json")), Map.class);

        String otl = "select\n" +
                "     order.orderId as orderId,\n" +
                "     timeStr(order.datetime) as datetime,\n" +
                "     order.ip as ip,\n" +
                "     upper(order.location) as location,\n" +
                "     order.ref as ref\n" +
                "from OrderData as order\n" +
                "where\n" +
                "     (reduce on order.items using sum(amount*(price-cost)) - order.transferCost) > 0";
        ITLExplainService ITLExplainService = new ITLExplainService();

        ITLExplainService.addITL("orderITL", otl);

        long start = System.currentTimeMillis();
        int count = 1;
        for (int i = 0; i < count; i++) {
            Object ret = ITLExplainService.process("OrderData", data);
            System.out.println(gson.toJson(ret));
            if (i % (1024 * 1024) == 0) {
                long time = System.currentTimeMillis() - start;
//                System.out.println(i / time);
            }
        }
        long time = System.currentTimeMillis() - start;
//        System.out.println(count / time);
    }


    static void runResume() throws NoSuchMethodException {
        Map data = gson.fromJson(new InputStreamReader(DemoAppMain.class.getResourceAsStream("/person.json")), Map.class);

        String otl = "select\n" +
                "     person.name as name,\n" +
                "     upper(person.addr) as addr,\n" +
                "     person.workexp[0] as firstwork,\n" +
                "     isGoodIncome(person.age, person.education, person.income) as isGoodIncome,\n" +
                "     (person.income-person.startIncome)/person.workyear as salaryIncreaseYearly,\n" +
                "     null as furtherData,\n" +
                "     nowStr() as datetime,\n" +
                "     \"Phase1\" as currStep,\n" +
                "     99 as status,\n" +
                "     'a' as grade,\n" +
                "     98.5 as mark,\n" +
                "     person.married as marriedStatus,\n" +
                "     map on person.workexp (companyName) as mapCompanyName,\n" +
                "     reduce on person.workexp using maxOnFirst(workYear,companyName,position) as maxWorkExp\n" +
                "from PersonData as person\n" +
                "    where (person.age > 30 and person.workyear > 7) \n" +
                "    or person.location=\"Shanghai\"\n" +
                "    or person.education=\"doctor\"\n" +
                "    ";
        ITLExplainService ITLExplainService = new ITLExplainService();

        Method method = ExtensionFunction.class.getMethod("isGoodIncome", double.class, String.class, double.class);

        ITLExplainService.addFunction("isGoodIncome", method, null);


        ITLExplainService.addITL("personITL", otl);

        long start = System.currentTimeMillis();
        int count = 1;
        for (int i = 0; i < count; i++) {
            Object ret = ITLExplainService.process("PersonData", data);
            System.out.println(gson.toJson(ret));
            if (i % (1024 * 1024) == 0) {
                long time = System.currentTimeMillis() - start;
//                System.out.println(i / time);
            }
        }
        long time = System.currentTimeMillis() - start;
//        System.out.println(count / time);
    }

}

```


TODO:

# Detail Grammar

# Detail Feature List



# Something more to say about transform

### Using hard code

### Using Config

### Using Script

### Using DSL


# About Self-defined function

