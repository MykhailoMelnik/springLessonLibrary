package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Pet pet;

    public Person() {

    }

    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my pet!");
        pet.say();
    }
}
