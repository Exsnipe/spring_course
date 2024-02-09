package aop1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Ivanov Ivan", 1, 4.02);
        Student st2 = new Student("Petr Petrov", 4, 3.66);
        Student st3 = new Student("Elena Sidorova", 3, 4.42);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudemts");
        System.out.println(students.get(1));
        System.out.println(students);
        return students;
    }


}
