package hibernate_test4.detail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Employee employee = new Employee("Tolka", "Strudel", "hr", 1000);
//            Detail detail = new Detail("Canada", "Horob", "0977434777");
//            detail.setEmployee(employee);
//            session.save(detail);

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,2);;
//            System.out.println(employee);
//            System.out.println(session.get(Employee.class,1));

            Employee employee = session.get(Employee.class,3);;
            System.out.println(employee.getDetail());

        } finally {
            System.out.println("finally");
            session.getTransaction().commit();
            sessionFactory.close();
        }
    }

}
