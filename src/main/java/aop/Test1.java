package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        AbstractLibrary schoolLibrary = context.getBean("schoolLibrary", AbstractLibrary.class);
        AbstractLibrary unilibrary = context.getBean("uniLibrary", AbstractLibrary.class);
        schoolLibrary.getBook();
        unilibrary.getBook();

        context.close();
    }

}
