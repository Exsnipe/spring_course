package aop1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(String returnBook())")
    public Object returnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("returnBookLoggingAdvice: trying to return book to the library");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception exception) {
            System.out.println("returnBookLoggingAdvice: The exception "
                    + exception + " has been thrown");
            throw exception;
        }
        System.out.println("returnBookLoggingAdvice: the book " +
                targetMethodResult + " has been returned successfully");
        return targetMethodResult;
    }
}
