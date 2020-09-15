package ru.mirea.lab1;

import java.lang.*;
public class Ball {
    private String color;
    private int radius;

    public Ball (String c, int r) {
        color = c;
        radius = r;
    }

    public Ball () {
        color = "";
        radius = 0;
    }

    public void SetColor (String color) {
        this.color = color;
    }

    public void SetRadius (int radius) {
        this.radius = radius;
    }

    public void ToString() {
        System.out.println ("Цвет: "+this.color+", радиус: "+this.radius+" см.");
    }

}
