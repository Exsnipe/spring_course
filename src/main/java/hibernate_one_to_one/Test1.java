package hibernate_one_to_one;

import hibernate_one_to_one.entity.Employee;
import hibernate_one_to_one.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

       /* try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee(
                    "Fedya", "Petrov", "IT", 1500
            );
            Detail empDetail = new Detail(
                    "Ivanovo", "89450483848", "fedya777@inbox.ru"
            );
            employee.setEmpDetail(empDetail);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }*/

        /*try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee(
                    "Anton", "Medvedev", "HR", 950
            );
            Detail empDetail = new Detail(
                    "Bobrov", "89045781209", "MDK@inbox.ru"
            );
            employee.setEmpDetail(empDetail);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }*/
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println(employee.getEmpDetail());
        } finally {
            session.close();
            factory.close();
        }
    }
}
