package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private String data2;
    private DataBean1 data3;

    public TestBean1(int data1, String data2, DataBean1 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    @Override
    public String toString() {
        return "TestBean1{" +
                "data1=" + data1 +
                ", data2='" + data2 + '\'' +
                ", data3=" + data3 +
                '}';
    }
}
