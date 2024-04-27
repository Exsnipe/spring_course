package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void get*(..))")
    public void beforeGetBookAdvise() {
        System.out.println("beforeGetBookAdvise: try to get a book");
    }

    @Before("execution(* return*())")
    public void beforeReturnBook() {
        System.out.println("beforeReturnBook: try to return book");
    }
}
