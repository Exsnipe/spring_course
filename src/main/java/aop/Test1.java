package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);

        SchoolLibrary library = context.getBean("schoolLibrary", SchoolLibrary.class);
        library.getBook();

        context.close();
    }
}
