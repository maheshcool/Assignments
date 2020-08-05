package com.example.assignment2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.List;

public class Stock {
    static Map<String, Book> stock = new HashMap<String, Book>();
    
    static Map<String, Collection<String>> yearRecord = new HashMap<String, Collection<String>>();
    static Map<String, Collection<String>> titleRecord = new HashMap<String, Collection<String>>();
    static Map<String, Collection<String>> authorRecord = new HashMap<String, Collection<String>>();
    
    private void check(Map<String, Collection<String>> map,String key, String value) {
        if(!map.containsKey(key)) {
            List<String> temp = new ArrayList<String>();
            temp.add(value);
            map.put(key, temp);
        }
    }
    
    protected void addBook(Book b) {
        stock.put(b.isbn, b);
        check(yearRecord, b.publicationYear, b.isbn);
        yearRecord.get(b.publicationYear).add(b.isbn);
        check(titleRecord, b.title, b.isbn);
        titleRecord.get(b.title).add(b.isbn);
        check(authorRecord, b.author, b.isbn);
        authorRecord.get(b.author).add(b.isbn);
    }

    protected int isbnKey(int i, int j, int k, int l, int m) {
        return (100000*i + 10000*j + 1000*k + 100*l + 10*m);
    }

    protected void maintain_Stock() {
        char [] c1 = new char[1];
        for(int i=0; i<20; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    for(int l =0; l<10; l++) {
                        for(int m=0; m<10; m++) {
                            char c = (char)('A' + i);
                            c1[0] = c;
                            String bk = new String(c1);
                            Book temp =new Book(bk + j, "A" + j,
                                                "ISBN" + isbnKey(i, j, k, l, m),
                                                "P" + i,
                                                "L" + l, "200" + k, 
                                                "Digital", 
                                                100 + i + j + k + l + m );
                            addBook(temp);
                        }
                    }
                }
            }
        } 
    }

    public boolean findBookBYYear(String year) {
        return titleRecord.containsKey(year);
    }
    public boolean findBookByTitle(String title) {
        return titleRecord.containsKey(title);
    }
    public boolean findBookBYAuthor(String author) {
        return titleRecord.containsKey(author);
    }
    
    public List<Book> getBook(List<String> isbn) {
        List<Book> temp =  new ArrayList<Book>();
        for(String i : isbn) {
            temp.add(stock.get(i));
        }
        return temp;
    }

    public List<Book> getByTitle(String title) {
        List<String> isbn = (List)titleRecord.get(title);
        return getBook(isbn);
    }
    public List<Book> getByYear(String year) {
        List<String> isbn = (List)yearRecord.get(year);
        return getBook(isbn);
    }
    public List<Book> getByAuthor(String author) {
        List<String> isbn = (List)authorRecord.get(author);
        return getBook(isbn);
    }

    public void showListView(List<Book> b) {
        int j = 1;
        for(Book i : b) {
            System.out.print(j +  " : ");
            i.showListView();
            j++;
        }
    }

}