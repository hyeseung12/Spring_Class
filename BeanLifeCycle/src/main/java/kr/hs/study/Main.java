package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean t1 = ctx.getBean("t1", TestBean.class);
        TestBean t2 = ctx.getBean("t2", TestBean.class);

        System.out.println(t1);
        System.out.println(t2);

        ctx.close();
    }
}