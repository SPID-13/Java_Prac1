package ru.mirea.lab1;

import java.lang.*;
public class BookTest {
    public static void  main (String[] args) {
        Book bk1 = new Book("Молчание ягнят", 65);
        Book bk2 = new Book ();
        bk2.SetTitle("Война и мир");
        bk2.SetPage(300);
        bk1.ToString();
        bk2.ToString();
    }
}
