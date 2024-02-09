package aop1.aspect;

import aop1.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение" +
                "  списка студетов перед методом getStudents");
    }

    /*@AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double averageGrade = firstStudent.getAverageGrade();
        averageGrade += 0.5;
        firstStudent.setAverageGrade(averageGrade);


        System.out.println("AfterReturningGetStudentsLoggingAdvice: логируем получение" +
                "  списка студетов после метода getStudents");
    }*/

    /*@AfterThrowing(pointcut = "execution(* getStudents())",
        throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем " +
                " выброс исключения " + exception);
    }*/

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice");
    }
}
