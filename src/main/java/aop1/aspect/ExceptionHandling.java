package aop1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order
public class ExceptionHandling {

    @Before("aop1.aspect.pointcut.Pointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: " +
                "try to obtain book/magazine");
        System.out.println("---------------------------------------");
    }
}
