package kr.hs.study.config;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {
    @Bean
    public TestBean1 java1() {
        TestBean1 t1 = new TestBean1(11, "Marc11", new DataBean1());
        return t1;
    }

    @Bean
    public TestBean2 java2() {
        TestBean2 t = new TestBean2();
        t.setData1(22);
        t.setData2(22.22);
        t.setData3(new DataBean1());
        t.setData4(new DataBean1());
        return t;
    }
}
