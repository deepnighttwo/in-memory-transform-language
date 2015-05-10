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

        System.out.println(System.currentTimeMillis());


        Map data = gson.fromJson(new InputStreamReader(JSONVisitorAppMain.class.getResourceAsStream("/person.json")), Map.class);

        String otl = "select\n" +
                "     person.name as name,\n" +
                "     upper(person.addr) as addr,\n" +
                "     person.workexp[0].companyName as firstworkCompany,\n" +
                "     isGoodIncome(person.age, person.education, person.income) as isGoodIncome,\n" +
                "     (person.income-person.startIncome)/person.workyear as salaryIncreaseYearly,\n" +
                "     null as furtherdata,\n" +
                "     nowStr() as datetime,\n" +
                "     \"Phase1\" as currStep,\n" +
                "     99 as status,\n" +
                "     'a' as grade,\n" +
                "     98.5 as mark,\n" +
                "     person.married as marriedStatus" +
                " from PersonData as person\n" +
                " where (person.age > 30 and person.workyear > 7) \n" +
                "    or person.location=\"Shanghai\"\n" +
                "    or person.education=\"Phd\"";
        ITLExplainService ITLExplainService = new ITLExplainService();

        Method method = ExtensionFunction.class.getMethod("isGoodIncome", double.class, String.class, double.class);

        ITLExplainService.addFunction("isGoodIncome", method, null);


        ITLExplainService.addITL("first", otl);

        long start = System.currentTimeMillis();
        int count = 1;
        for (int i = 0; i < count; i++) {
            Object ret = ITLExplainService.process("PersonData", data);
            System.out.println(ret);
            if (i % (1024 * 1024) == 0) {
                long time = System.currentTimeMillis() - start;
                System.out.println(i / time);
            }
        }
        long time = System.currentTimeMillis() - start;
        System.out.println(count / time);


    }
}
