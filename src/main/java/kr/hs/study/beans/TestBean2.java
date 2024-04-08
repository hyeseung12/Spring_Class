package kr.hs.study.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TestBean2 {
    public TestBean2() {
        System.out.println("2");
    }

    @PostConstruct
    public void init() {
        System.out.println("init 메소드 입니다.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy 메소드 입니다.");
    }
}
