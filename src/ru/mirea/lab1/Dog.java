package ru.mirea.lab1;

import java.lang.*;
public class Dog {
    private String name;
    private int age;

    public Dog (String n, int a) {
        name = n;
        age = a;
    }

    public Dog () {
        name = "";
        age = 0;
    }

    public void SetName (String name) {
        this.name = name;
    }

    public void SetAge (int age) {
        this.age = age;
    }

    public void ToString() {
        System.out.println ("Кличка: "+this.name+", возраст: "+this.age+" лет.");
    }

    public void InToHumanAge() {
        System.out.println (name+" "+age*7+" человеческих лет.");
    }
}
