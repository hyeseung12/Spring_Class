package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 t1 = ctx.getBean(TestBean1.class);
        System.out.println(t1);

        TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
        System.out.println(t2);

        ctx.close();
    }
}