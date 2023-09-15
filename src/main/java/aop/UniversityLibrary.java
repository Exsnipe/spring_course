package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary {
    public void getBook(Book book) {
        System.out.println("We take book from the university library " + book.getName());
    }

    protected String returnBook() {
        System.out.println("We return book to the university library");
        return "ok";
    }
}
