package kr.hs.study;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        obj1.prData();

        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        obj2.prData();

        TestBean obj3 = ctx.getBean("t3", TestBean.class);
        obj3.prData();

        TestBean obj4 = ctx.getBean("t4", TestBean.class);
        obj4.prData();

        // java 코드로 AllArgsConstructor 값 출력하기
        TestBean java = new TestBean(66, 66.66, "Mike66");
        // TestBean java = new TestBean("Mike66", 66.66, 66); -> java 에서는 타입 순서 중요함 (에러 발생)
        java.prData();

        TestBean obj5 = ctx.getBean("t5", TestBean.class);
        obj5.prData();

        TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
        obj6.prData();

        ctx.close();
    }
}