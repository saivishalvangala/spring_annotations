package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    @Value("${name}")
    private String name;

    @Value("${gender}")
    private String gender;

    @Value("${age}")
    private int age;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void displayInfo(){
        System.out.println("Name of actor: "+name);
        System.out.println("gender of actor: "+gender);
        System.out.println("Age of actor: "+age);
    }
}
