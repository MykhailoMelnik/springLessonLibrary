package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Id;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Mikhail", "Ivan", "IT", 5000);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();


            Session session1 = sessionFactory.getCurrentSession();
            session1.beginTransaction();
            Employee employee1 = session1.get(Employee.class, 2);
            Employee employee2 = session1.get(Employee.class, 4);
            Employee employee3 = session1.get(Employee.class, 3);
            session1.getTransaction().commit();
            System.out.println(employee1.getName());
            System.out.println(employee2.getName());
            System.out.println(employee3);
        } finally {
            sessionFactory.close();
        }


    }
}
