package aop1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary =  context.getBean("uniLibrary", UniLibrary.class);
        String returnedBook = uniLibrary.returnBook();

        context.close();
    }
}
