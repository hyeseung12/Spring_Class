package kr.hs.study.beans;

public class TestBean {
    int data1;
    double data2;
    String data3;

    public TestBean() {
        this.data1 = 11;
        this.data2 = 11.11;
        this.data3 = "Mike11";
    }

    public void prData() {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data3 : " + data3);
    }
}
