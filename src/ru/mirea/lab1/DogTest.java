package ru.mirea.lab1;

import java.lang.*;
public class DogTest {
    public static void  main (String[] args) {
        Dog d1 = new Dog("Белка", 6);
        Dog d2 = new Dog ();
        d2.SetName("Шарик");
        d2.SetAge(10);
        d1.ToString();
        d2.ToString();
    }
}
