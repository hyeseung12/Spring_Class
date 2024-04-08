package kr.hs.study.beans;

public class TestBean2 {
    private int data1;
    private double data2;
    private DataBean1 data3;
    private DataBean1 data4;

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    public DataBean1 getData3() {
        return data3;
    }

    public void setData3(DataBean1 data3) {
        this.data3 = data3;
    }

    public DataBean1 getData4() {
        return data4;
    }

    public void setData4(DataBean1 data4) {
        this.data4 = data4;
    }

    @Override
    public String toString() {
        return "TestBean2{" +
                "data1=" + data1 +
                ", data2=" + data2 +
                ", data3=" + data3 +
                ", data4=" + data4 +
                '}';
    }
}
