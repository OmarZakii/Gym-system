package com.company;

public abstract class Person {
    private String name;
    private int age ;
    private int ID;
    public Person(){

    }
    public Person(String name, int ID,int age) {
        this.name = name;
        this.ID = ID;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +" ,"
                ;
    }
}

