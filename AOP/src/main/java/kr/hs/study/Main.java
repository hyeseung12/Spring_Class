package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
        t1.method1();
        System.out.println();
        t1.method2();
        System.out.println();
        t1.method3();
        System.out.println();
        t1.method4();
        System.out.println();
        t1.method5();

        ctx.close();
    }
}