package kr.hs.study.beans;

public class TestBean5 {
    public TestBean5() {
        System.out.println("TestBean5의 기본 생성자");
    }

    public void init() {
        System.out.println("TestBean5 : init method");
    }

    public void destroy() {
        System.out.println("TestBean5 : destroy method");
    }
}
