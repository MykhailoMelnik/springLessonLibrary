package aop;

import org.springframework.stereotype.Component;

@Component("libraryBen")
public class Library {

    public void getBook (){
        System.out.println("берём книгу");
    }
}
