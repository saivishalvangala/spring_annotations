package com.stackroute.domain;


public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

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
