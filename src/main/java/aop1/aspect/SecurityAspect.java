package aop1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("aop1.aspect.pointcut.Pointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAllMethodsSecurityAdvice: lod #3");
        System.out.println("---------------------------------------");
    }
}
