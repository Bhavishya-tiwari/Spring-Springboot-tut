package org.example;

public class Alien {
    private int age;
    private Laptop lap;
    public void code(){

        System.out.println("I am Coding..");
        lap.compile();
    }
    public void printAge(){
        System.out.println(age);
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public void setAge(int age) {
        System.out.println("Age Assigned....");
        this.age = age;
    }
}
