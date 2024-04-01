package kr.hs.study.config;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {
    @Bean
    public TestBean1 java1() {
        TestBean1 t1 = new TestBean1(11, "Marc11", new DataBean1());
        return t1;
    }
}
