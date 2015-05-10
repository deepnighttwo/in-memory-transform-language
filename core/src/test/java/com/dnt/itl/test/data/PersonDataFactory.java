package com.dnt.itl.test.data;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Mark Zang
 * Date: 2015/4/25
 * Time: 20:09
 */
public class PersonDataFactory {

    public static PersonData createTestPersonData() {
        PersonData data = new PersonData();
        data.setName("Jim Green");
        data.setAddr("Shanghai Tangchen yipin No1");
        List<Map<String, String>> workexp = new ArrayList<>();

        Map<String, String> exp = new HashMap<>();
        exp.put("companyName", "Mobile");
        exp.put("position", "Software Developer");
        workexp.add(exp);

        exp = new HashMap<>();
        exp.put("companyName", "Google");
        exp.put("position", "Software Developer");
        workexp.add(exp);

        exp = new HashMap<>();
        exp.put("companyName", "Baidu");
        exp.put("position", "Staff");
        workexp.add(exp);

        data.setWorkexp(workexp);

        data.setAge(25);
        data.setEducation("University");
        data.setIncome(1500000);
        data.setStartIncome(80000);
        data.setWorkyear(5);
        data.setLocation("Shanghai");
        data.setMarried(true);

        return data;
    }

    public static PersonData createPersonDataFromJSON() {
        Gson gson = new Gson();
        PersonData data = gson.fromJson(new InputStreamReader(PersonDataFactory.class.getResourceAsStream("/person.json")), PersonData.class);
        return data;
    }


}
