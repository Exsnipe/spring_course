package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(myConfig.class);

        UniversityLibrary uniLib = context.getBean("universityLibrary", UniversityLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLib.getBook(book);
//        SchoolLibrary schoolLib = context.getBean("schoolLibrary", SchoolLibrary.class);
//        uniLib.returnBook();
//        schoolLib.getBook();

        context.close();
    }
}
