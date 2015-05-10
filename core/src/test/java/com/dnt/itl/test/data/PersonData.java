package com.dnt.itl.test.data;

import java.util.List;
import java.util.Map;

/**
 * User: Mark Zang
 * Date: 2015/4/25
 * Time: 20:06
 */
public class PersonData {
    String name;
    String addr;
    List<Map<String, String>> workexp;
    int age;
    String education;
    int income;
    int startIncome;
    int workyear;
    String location;
    boolean married;

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public List<Map<String, String>> getWorkexp() {
        return workexp;
    }

    public void setWorkexp(List<Map<String, String>> workexp) {
        this.workexp = workexp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getStartIncome() {
        return startIncome;
    }

    public void setStartIncome(int startIncome) {
        this.startIncome = startIncome;
    }

    public int getWorkyear() {
        return workyear;
    }

    public void setWorkyear(int workyear) {
        this.workyear = workyear;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", workexp=" + workexp +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", income=" + income +
                ", startIncome=" + startIncome +
                ", workyear=" + workyear +
                ", location='" + location + '\'' +
                ", married=" + married +
                '}';
    }
}
