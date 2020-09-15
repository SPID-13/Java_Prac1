package ru.mirea.lab1;

import java.lang.*;
public class BallTest {
    public static void  main (String[] args) {
        Ball b1 = new Ball("Красный", 10);
        Ball b2 = new Ball ();
        b2.SetColor("Зеленый");
        b2.SetRadius(15);
        b1.ToString();
        b2.ToString();
    }
}
