package kr.hs.study.beans;

public class TestBean2 {
    private DataBean2 data1;

    public TestBean2(DataBean2 data1) {
        this.data1 = data1;
    }

    public void prData() {
        System.out.println("================================================");
        System.out.println("data1 : " + data1);
        System.out.println("================================================");
    }
}
