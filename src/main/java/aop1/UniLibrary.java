package aop1;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("We take a book from UniLibrary: ");
        System.out.println("---------------------------------");
    }
    public String returnBook() {
        System.out.println("We return \"Tender is the night\"  to the UniLibrary");
        System.out.println("---------------------------------");
        return "\"Tender is the night\"";
    }
    public void getMagazine() {
        System.out.println("We take a magazine from UniLibrary");
        System.out.println("---------------------------------");
    }
    public void returnMagazine() {
        System.out.println("We return a magazine to the UniLibrary");
        System.out.println("---------------------------------");
    }
    public void addBook(String personName, Book book) {
        System.out.println("Add book to the UniLibrary");
        System.out.println("---------------------------------");
    }
    public void addMagazine() {
        System.out.println("Add magazine  to the UniLibrary");
        System.out.println("---------------------------------");
    }
}
