package com.example.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static int amount = 0;
        List<Book> list = new ArrayList<Book>();
    
    public void addCart(Book b) {
        list.add(b);
        amount += b.price;
        System.out.println("\033[0;32mBook " + b.title + " added to the cart.");
    }

    public int showPrice() {
        return amount;
    }

    public void showCart() {
        for(Book i: list) {
            System.out.println(i.title);
        }
    }

    public void clearCart() {
        list.clear();
    }
}