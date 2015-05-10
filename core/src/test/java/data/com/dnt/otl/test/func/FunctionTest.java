package data.com.dnt.otl.test.func;

import com.dnt.itl.ext.ExtensionFunction;
import com.dnt.itl.parser.ITLExplainService;
import com.dnt.itl.test.data.PersonData;
import com.dnt.itl.test.data.PersonDataFactory;
import com.google.gson.Gson;
import org.junit.Test;

import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * User: Mark Zang
 * Date: 2015/4/25
 * Time: 21:12
 */
public class FunctionTest {


    static int count = 1024 * 100000;

    @Test
    public void fullTestJSONMap() throws NoSuchMethodException {

        Gson gson = new Gson();
        Map data = gson.fromJson(new InputStreamReader(FunctionTest.class.getResourceAsStream("/person.json")), Map.class);

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
        for (int i = 0; i < count; i++) {
            Object ret = ITLExplainService.process("PersonData", data);
//            System.out.println(ret);
            if (i % (1024 * 1024) == 0) {
                long time = System.currentTimeMillis() - start + 1;
                System.out.println("JSON Map tps " + i / time);
            }
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("Final JSON Map tps " + count / time);
    }


    @Test
    public void fullTestJavaBeans() throws NoSuchMethodException {

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

        PersonData data = PersonDataFactory.createPersonDataFromJSON();

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Object ret = ITLExplainService.process("PersonData", data);
//            System.out.println(ret);
            if (i % (1024 * 1024) == 0) {
                long time = System.currentTimeMillis() - start + 1;
                System.out.println("Java Bean tps " + i / time);
            }
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("Final Java Bean tps " + count / time);

    }
}
