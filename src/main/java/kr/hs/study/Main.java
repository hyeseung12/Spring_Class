package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
        t1.method1();
        t1.method1(30);
        t1.method1("string");
        t1.method1(50, 50);
        t1.method1("hello", "world");
        t1.method2();
        t1.method3();

        System.out.println("=============================");

        kr.hs.study.beans2.TestBean1 t2 = ctx.getBean("t2", kr.hs.study.beans2.TestBean1.class);
        t2.method1();

        ctx.close();
    }
}