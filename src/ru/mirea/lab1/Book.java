package ru.mirea.lab1;

import java.lang.*;
public class Book {
    private String title;
    private int page;

    public Book (String t, int p) {
        title = t;
        page = p;
    }

    public Book () {
        title = "";
        page = 0;
    }

    public void SetTitle (String title) {
        this.title = title;
    }

    public void SetPage (int page) {
        this.page = page;
    }

    public void ToString() {
        System.out.println ("Название: "+this.title+", кол-во страниц: "+this.page+".");
    }

}
