package aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution( void get*())")
    public void logging() {
        System.out.println("logging");
    }

    @After("execution( * get*())")
    public void logout(){
        System.out.println("logout");
    }
}
