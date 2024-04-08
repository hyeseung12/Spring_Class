package kr.hs.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study.beans"})
// beans 패키지 밑의 모든 클래스들에 있는 어노테이션을 <분석해서> 객체를 만들고 객체를 만들고 컨테이너에 보관해라.
public class BeanConfigClass {
}
