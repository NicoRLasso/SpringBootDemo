package com.example.demo.domain;

public class User {
    private String name ;
    private int age;
    private boolean employer;
    private String gender;
     
    public User(){

    }

    public User(String name, int age, boolean employer, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.employer = employer;
        this.gender = gender;
    }

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
    public boolean isemployer() {
        return employer;
    }
    public void setemployer(boolean employer) {
        this.employer = employer;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    
}
