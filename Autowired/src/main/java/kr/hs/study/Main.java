package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BaseConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BaseConfigClass.class);

        TestBean1 t1 = ctx.getBean(TestBean1.class);
//        t1.setData1(new DataBean1());
        System.out.println(t1.getData1());

        ctx.close();
    }
}