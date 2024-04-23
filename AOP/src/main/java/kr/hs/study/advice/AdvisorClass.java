package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

// advice(충고)가 들어가는 클래스
public class AdvisorClass {
    public void before() {
        System.out.println("before Method");
    }

    public void after() {
        System.out.println("after Method");
    }

    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around 앞 메서드");
        pjp.proceed(); // method 호출시키는 것
        System.out.println("around 뒤 메서드");
    }

    public void afterReturning() {
        System.out.println("에러없이 완료된 후 실행되는 afterReturning");
    }

    public void afterThrowing(Throwable e) {
        System.out.println("예외발생시 실행되는 메서드");
        System.out.println(e);
    }
}
