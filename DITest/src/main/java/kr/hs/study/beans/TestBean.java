package kr.hs.study.beans;

public class TestBean {
    private int data1;
    private double data2;
    private Person p1;
    private Person p2;

    public TestBean(int data1, double data2, Person p1, Person p2) {
        this.data1 = data1;
        this.data2 = data2;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "data1=" + data1 +
                ", data2=" + data2 +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
