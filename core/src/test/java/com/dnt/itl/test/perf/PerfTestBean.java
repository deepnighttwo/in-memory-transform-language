package com.dnt.itl.test.perf;

/**
 * User: Mark Zang
 * Date: 2015/4/28
 * Time: 13:00
 */
public class PerfTestBean {

    String strvar = String.valueOf(System.currentTimeMillis());

    public String perfTest() {
        return strvar;
    }

    private int intvar = (int) System.currentTimeMillis();

    public int perfTestUseRet() {
        return intvar;
    }

    public Integer perfTestUseRetBox() {
        return intvar;
    }

    long longret = System.currentTimeMillis();

    Long longretBoxed = System.currentTimeMillis();

    public Long perfTestUseRetBoxLong() {
        return longret;
    }


    public long perfTestUseRetLong() {
        return longret;
    }

    public Long perfTestUseRetBoxLong2() {
        return longretBoxed;
    }

    public Long perfTestUseRetLongContainsLogic() {
        long start = System.nanoTime();
        intvar++;
        long takes = System.nanoTime() - start;
        return takes;
    }

    public String getStrvar() {
        return strvar;
    }

    public void setStrvar(String strvar) {
        this.strvar = strvar;
    }

    public int getIntvar() {
        return intvar;
    }

    public void setIntvar(int intvar) {
        this.intvar = intvar;
    }

    public long getLongret() {
        return longret;
    }

    public void setLongret(long longret) {
        this.longret = longret;
    }
}
