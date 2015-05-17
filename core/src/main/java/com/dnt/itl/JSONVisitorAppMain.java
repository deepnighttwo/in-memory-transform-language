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
public class JSONVisitorAppMain {

    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        runOrder();
        runResume();
    }

    static void runOrder() throws NoSuchMethodException {
        Map data = gson.fromJson(new InputStreamReader(JSONVisitorAppMain.class.getResourceAsStream("/order.json")), Map.class);

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
        Map data = gson.fromJson(new InputStreamReader(JSONVisitorAppMain.class.getResourceAsStream("/person.json")), Map.class);

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
