package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
//            employee.setName("Antonio");

            session.createQuery("update Employee set salary = 1000 where name = 'Mikhail' or name = 'Ivan'")
                    .executeUpdate();

            session.getTransaction().commit();
//            System.out.println(employee);

        } finally {
            sessionFactory.close();
        }


    }
}
