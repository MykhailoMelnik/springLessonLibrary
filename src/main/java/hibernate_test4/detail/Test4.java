package hibernate_test4.detail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

//            Employee employee = new Employee("Ivan", "Melnik", "IT", 2000);
//            Detail detail = new Detail("Usa", "Gorohol", "0977777777");
//            employee.setDetail(detail);
//            session.save(employee);

            session.beginTransaction();
            Employee employee = session.get(Employee.class,2);
            System.out.println(employee);
            System.out.println(session.get(Employee.class,1));

        } finally {
            session.getTransaction().commit();
            sessionFactory.close();
        }
    }

}
