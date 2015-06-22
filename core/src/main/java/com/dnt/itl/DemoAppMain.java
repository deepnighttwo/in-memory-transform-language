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
 * Date: 2015/4/16
 * Time: 16:30
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
                "     getResumeRate(person.age, person.education, person.income) as resumeRate,\n" +
                "     (person.income-person.startIncome)/person.workyear as salaryIncreaseYearly,\n" +
                "     null as furtherData,\n" +
                "     nowStr() as datetime,\n" +
                "     \"Phase1\" as currStep,\n" +
                "     99 as status,\n" +
                "     'a' as grade,\n" +
                "     98.5 as mark,\n" +
                "     person.married as marriedStatus,\n" +
                "     map on person.workexp using upper (companyName) as mapCompanyName,\n" +
                "     reduce on person.workexp using maxOnFirst(workYear,companyName,position) as maxWorkExp\n" +
                "from PersonData as person\n" +
                "    where (person.age > 30 and person.workyear > 7) \n" +
                "    or person.location=\"Shanghai\"\n" +
                "    or person.education=\"doctor\"\n" +
                "    ";

        // ITLExplainService is used to run ITL
        ITLExplainService ITLExplainService = new ITLExplainService();

        // Add a self-defined function
        Method method = ExtensionFunction.class.getMethod("getResumeRate", double.class, String.class, double.class);
        ITLExplainService.addFunction("getResumeRate", method, null);


        // Add an ITL
        ITLExplainService.addITL("personITL", otl);

        // process a data, the first args is the data type which meets the name in ITL's from statement
        Object ret = ITLExplainService.process("PersonData", data);
        // return result is a json string
        System.out.println(gson.toJson(ret));
    }

}
