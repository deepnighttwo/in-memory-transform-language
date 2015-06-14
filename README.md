# in-memory transform language

# Introduction

in-memory transform language (ITL for short) is a SQL-like language to transform in-memory data.
It is embedded, written in java and consume json or java bean object (so called in-memory).

Transform including select, calculation expression, filter, self-defined function and so on. An ITL looks like SQL. Here is an example which will be used in the Example section:

```sql
select
     person.name as name,
     upper(person.addr) as addr,
     person.workexp[0] as firstwork,
     isAboveAvg(person.age, person.education, person.income) as isAboveAvg,
     (person.income-person.startIncome)/person.workyear as salaryIncreaseYearly,
     null as furtherData,
     nowStr() as datetime,
     "Phase1" as currStep,
     99 as status,
     'a' as grade,
     98.5 as mark,
     person.married as marriedStatus,
     map on person.workexp using upper (companyName) as mapCompanyName,
     reduce on person.workexp using maxOnFirst(workYear,companyName,position) as maxWorkExp
from PersonData as person
    where (person.age > 30 and person.workyear > 7)
    or person.location="Shanghai"
    or person.education="doctor"
```

If familiar with ETL, ITL's function is very similar with the "T" in ETL. That is, to transform structured data.

# What For

Suppose there is a real time data source, it can be a SOA service, a queue or any way that can provide structured data.
And there is a target (could be a SOA service, a queue, a database) which expect data from the source but need some **transformation**.

Transformation is likely to change to fulfill business requirements: need a new field, need a new calculation, need a new filter rule...

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

A ITL to meet these requirements is as follow (Please notice that the ITL is trying to show more features and some part is not quite make sense actually.)::

```sql
select
     person.name as name,
     upper(person.addr) as addr,
     person.workexp[0] as firstwork,
     isAboveAvg(person.age, person.education, person.income) as isAboveAvg,
     (person.income-person.startIncome)/person.workyear as salaryIncreaseYearly,
     null as furtherData,
     nowStr() as datetime,
     "Phase1" as currStep,
     99 as status,
     'a' as grade,
     98.5 as mark,
     person.married as marriedStatus,
     map on person.workexp using upper (companyName) as mapCompanyName,
     reduce on person.workexp using maxOnFirst(workYear,companyName,position) as maxWorkExp
from PersonData as person
    where (person.age > 30 and person.workyear > 7)
    or person.location="Shanghai"
    or person.education="doctor"
```

After input the json data to the ITL above, the returned data from ITL is:

```json
{
  "personITL": {
    "name": "Jim Green",
    "addr": "SHANGHAI TANGCHEN YIPIN NO1",
    "firstwork": {
      "companyName": "Mobile",
      "position": "Software Developer",
      "workYear": 25
    },
    "isAboveAvg": true,
    "salaryIncreaseYearly": 2984000,
    "datetime": "2015-06-14 18:20:18.799",
    "currStep": "Phase1",
    "status": 99,
    "grade": "a",
    "mark": 98.5,
    "marriedStatus": true,
    "mapCompanyName": [
      "MOBILE",
      "BAIDU",
      "GOOGLE"
    ],
    "maxWorkExp": {
      "25.0": [
        25,
        "Mobile",
        "Software Developer"
      ]
    }
  }
}
```

Features demonstrated above including

 - Retrieve properties using **dot**
 - Retrieve array/list value using **[index]**
 - Function call (upper, isAboveAvg). upper is default function and isAboveAvg is self-defined
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

The following ITL can do the filter and transformations:

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

The key is using reduce and sum function to calculate and check if a order actually earn money. The result is:

```json
{
  "orderITL": {
    "orderId": "2015-05-10-11:59-878929384981",
    "datetime": "2015-05-10 12:01:00.766",
    "ip": "1.2.3.4",
    "location": "SHANGHAI",
    "ref": "google-search"
  }
}
```


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

/**
 * User: Mark Zang
 */
public class DemoAppMain {

    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        runOrder();
        runResume();
    }

    static void runOrder() throws NoSuchMethodException {
        // prepare data
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

        // ITLExplainService is used to run ITL
        ITLExplainService ITLExplainService = new ITLExplainService();
        // Add an ITL
        ITLExplainService.addITL("orderITL", otl);

        // process a data, the first args is the data type which meets the name in ITL's from statement
        Object ret = ITLExplainService.process("OrderData", data);
        // return result is a json string
        System.out.println(gson.toJson(ret));
    }


    static void runResume() throws NoSuchMethodException {
        // prepare data
        Map data = gson.fromJson(new InputStreamReader(DemoAppMain.class.getResourceAsStream("/person.json")), Map.class);

        String otl = "select\n" +
                "     person.name as name,\n" +
                "     upper(person.addr) as addr,\n" +
                "     person.workexp[0] as firstwork,\n" +
                "     isAboveAvg(person.age, person.education, person.income) as isAboveAvg,\n" +
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

        // ITLExplainService is used to run ITL
        ITLExplainService ITLExplainService = new ITLExplainService();

        // Add a self-defined function
        Method method = ExtensionFunction.class.getMethod("isAboveAvg", double.class, String.class, double.class);
        ITLExplainService.addFunction("isAboveAvg", method, null);


        // Add an ITL
        ITLExplainService.addITL("personITL", otl);

        // process a data, the first args is the data type which meets the name in ITL's from statement
        Object ret = ITLExplainService.process("PersonData", data);
        // return result is a json string
        System.out.println(gson.toJson(ret));
    }

}

```


# Detail Grammar

An ITL statement is formed by select part, from part and where part. where part is optional. It is very alike SQL. Here is the details:


## Select Part

Select part is formed by one or more value part separated by comma. It is better to specify a **as** so it can have a unique id in the result.

For example, a select part can looks like:

```sql
select VALUE_PART1 as prop1, VALUE_PART2 as prop2
```

So what is a value part? Here is the details of value part grammar:

### Value Part

Value part can be used in select part and and where part. That is, value part can be used to select a value in from part, and it can be used in where part for comparation.

Using the follow data as an example, the name of the datasource is **order** (Name of a datasouce is specified in from statement. This grammar will be mentioned later):

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


of A value part can be one of the following:

 - A cascaded property name of an data source. E.g. order.payTypes.creditCard will be a double 900.0
 - Array is supported using [INDEX]. E.g. order.items[0].name will be string "Devondale Milk imported from Australia"
 - Add, Sub, Multi, Div (+, -, *, /)calculation is supported. The return value will be represented using double. E.g. order.items[0].amount * order.items[0].count = 2 * 50 = 100.0 (represented using a double)
 - Literal float. E.g. 55.6
 - Literal charactor. E.g. 'a'
 - Literal String. E.g. "Tree"
 - Literal boolean. E.g. true or false
 - Null is represented using null

#### Functions

Except direct values, functions is also supported. E.g. upper(order.location) will pass order.location's vavlue to predefined function **upper**. upper's source code is:

```java
public final String upper(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
```

So upper(order.location) = upper("Shanghai") = "SHANGHAI"

Predefined functions are defined in class com.dnt.itl.parser.DefaultFunctions, here is the list:

 - String upper(String str): Return upper case of parameter String.
 - String lower(String str): Return lower case of parameter String.
 - String trim(String str): Return trim of parameter String.
 - String nowStr(): Return current time in yyyy-MM-dd HH:mm:ss.SSS format.
 - String timeStr(Number time): Covnert time in million second to yyyy-MM-dd HH:mm:ss.SSS
 - long now(): Return System.currentTimeMillis().
 - double sum(List<List> rows). Calculate sum of the list.

New functions can be added as follow:

```java
        // Add a self-defined function
        Method method = ExtensionFunction.class.getMethod("isAboveAvg", double.class, String.class, double.class);
        ITLExplainService.addFunction("isAboveAvg", method, null);
```

Please notice that the function can be static of non-static. But OTL runtime is NOT thread-safe (no sync for protection). So if the instance share data, please create a new instance for each or use sync to protect the data.

#### Map Calculation

Map calculation is used to process list properties. One example is given above:

```sql
    map on person.workexp using upper (companyName) as mapCompanyName,
```

In short, map will iterate the collection property, select the specified properties as parameters, call the specified function using the speicified paramters.
E.g, for **map on person.workexp using upper (companyName) as mapCompanyName**, it will:

 - for each row in person.workexp
   - select companyName from current row, call function upper using companyName.

To select more than one property, specify the property name in the brackets.

In this example, it returns:

```json
"mapCompanyName": [
      "MOBILE",
      "BAIDU",
      "GOOGLE"
    ]
```

#### Reduce Calculation

Reduce calculaton is similar to map. For example:

```sql
    reduce on person.workexp using maxOnFirst(workYear,companyName,position) as maxWorkExp
```

It will iterate person.workexp and select workYear,companyName,position for each row. Then call the reduce function maxOnFirst using the collected data.

 - Iterate person.workexp
   - Select workYear,companyName,position for each row. store it in an Object array.
 - Call maxOnFirst using the List<Object[]> as parameter. In the List, each Object array contains 3 elements (workYear,companyName,position).

## From Part

From part is using to specify which data source to use and specifiy alias for the data source.

Data is sent to ITL runtime as:

```java
ITLExplainService.process("PersonData", data);
```

"PersonData" is the datasource name. To specify the alias name of the datasource, using :

```sql
from PersonData as person
```

If don't specify an alias for the data source, then in the select part, please use the direct property name. For example, to select **orderId**, just use orderId, not order.orderId.


## Where part

Where part followed by an boolean expression. boolean expression can use boolean operations: <, <=, =, !=, >, >=. Operators can be value part.


## Other Details

Null support: If there is an null in the value path, the final value will be null.

# About Self-defined function

Self-defined function means binary dependeny. Pleas be careful to use it. If function changes very often, These might be a problem. Please consider using service call to decouple the binary dependency.

# Tech Details and Performance

Main calculation is java reflection invoke or map.get. Using Map or JSON, the performance on my test box is similar:

 - OS: Windows 7 32 Bit
 - CPU: Duo core 3.06GHz
 - Java: Java7 U 51
 - Memory: 512m

Performance is about 30 / ms.

To run the test, please use **maven clean package install -Pwt** to add the maven and run. It will add test classes to the final jar. Test details can be found in data.com.dnt.otl.test.func.FunctionTest.

# Something more to say about transform

If a system is mainly focused on data transformation and the business logic is comes from outside, the system is not easy to maintain.

## Using hard code

Every business request need a developer involve. Understande the requirments, make the code change, testing, communicate and make sure the change is expected, deploy the code.

So you can see the problem here are

 - the requester and the impler is not the same person. Impler need to understand the business from the requester.
 - There is a whole dev process to make the chagne avaliable.


## Using Config

Another popular way to fix the problem is using config. Developer predefine all supported transfermations. Requesters can use the system to impl their transformation business logic.

The potential problems are

 - Requester need to learn the system. System usability is a challenge.
 - If requester need a new transformation, it may takes longer time to impl than hard code. Depends on how good the system is designed and impled.
 - Hard to migrate or mentain.
 - Testing is problem. Requester needs to do the test. Configuration means a lot of things nested together, such as database, table schema, daos, bulabulabula.... How to help requester run test is nother challenge for the system.

## Using Script

Requesters use a script to do the transformation. It is powerful but harder for requester to learn. And the performance is not good. Exchagne data between script and host lang is not effective.

Also it is danger because requesters can write scripts as they expected.

## Using DSL

ITL is trying to fix the problem in a DSL way. It defined the grammar for transformation.

 - ITL itself is easy to maintain (comparing to using config).
 - Performance is good (comparing to script).
 - Safe. Requester can only do what they allowed to do.



