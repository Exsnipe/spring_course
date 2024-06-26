package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {/*
            session = factory.getCurrentSession();
            Department dep =new Department("IT",
                    600, 1300);
            Employee emp1 = new Employee("Artem", "Holodov", 780);
            Employee emp2 = new Employee("Viktor", "Krum", 1250);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();
            session.save(dep);

            session.getTransaction().commit();
            System.out.println("Done!");*/

            session = factory.getCurrentSession();


            session.beginTransaction();
            Employee employee = session.get(Employee.class, 4);
            System.out.println(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
