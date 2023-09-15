package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Tender is the night")
    private String name;

    public String getName() {
        return name;
    }
}
