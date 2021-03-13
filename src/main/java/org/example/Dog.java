package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    public void say() {
        System.out.println("wof");
    }
}
