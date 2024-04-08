package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println(obj1);

        TestBean2 obj2 = ctx.getBean(TestBean2.class);
        System.out.println(obj2);

        ctx.close();
    }
}