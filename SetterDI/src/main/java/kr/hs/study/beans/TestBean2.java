package kr.hs.study.beans;

public class TestBean2 {
    private DataBean2 data2;
    private DataBean2 data3;
    private DataBean2 data4;

    public DataBean2 getData2() {
        return data2;
    }

    public void setData2(DataBean2 data2) {
        this.data2 = data2;
    }

    public DataBean2 getData3() {
        return data3;
    }

    public void setData3(DataBean2 data3) {
        this.data3 = data3;
    }

    public DataBean2 getData4() {
        return data4;
    }

    public void setData4(DataBean2 data4) {
        this.data4 = data4;
    }

    @Override
    public String toString() {
        return "TestBean2{" +
                "data2=" + data2 +
                ", data3=" + data3 +
                ", data4=" + data4 +
                '}';
    }
}
