package aop1.aspect;

import aop1.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("aop1.aspect.pointcut.Pointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] arguments = joinPoint.getArgs();
        if (methodSignature.getName().equals("addBook")) {
            for (Object arg : arguments) {
                if (arg instanceof Book) {
                    Book myBook = (Book) arg;
                    System.out.println("Author: " + myBook.getAuthor()
                            + " Name: " + myBook.getName() + " Year: " + myBook.getYearOfPublication());
                }
                if (arg instanceof String) {
                    System.out.println(" The book was added by: " + arg.toString());
                }
            }
        }
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName = " + methodSignature.getName());
        System.out.println("beforeAddLoggingAdvice: " +
                        "try to add book/magazine");
        System.out.println("---------------------------------------");
    }
}
