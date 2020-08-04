package com.example.assignment1;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    static Map<String, Book> stock = new HashMap<String, Book>();
    
    protected void addBook(Book b) {
        stock.put(b.title, b);
    }

    protected void maintain_Stock() {
        for(int i=0; i<20; i++){
            Book temp =new Book("B" + i, "A" + i, "ISBN" + i, "P" + i,
                                "L" + i, 2000 + i, "Digital", 100+i);
            addBook(temp);
        } 
    }

    public boolean findBook(String bookName) {
        return stock.containsKey(bookName);
    }
    
    public Book getBook(String bookName) {
        return stock.get(bookName);
    }
}