package com.example.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static Comparator<Book> priceComparator = new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            return b1.price - b2.price;
        }  
    };
    public static Comparator<Book> titleComparator = new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            String t1 = b1.title.toUpperCase(), t2 = b2.title.toUpperCase();
            return t1.compareTo(t2);
        }
    };
    public static Comparator<Book> yearComparator = new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            String y1 = b1.publicationYear.toUpperCase(), y2 = b2.publicationYear.toUpperCase();
            return y1.compareTo(y2);
        }
    };
    public static Comparator<Book> authorComparator = new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            String a1 = b1.author.toUpperCase(), a2 = b2.author.toUpperCase();
            return a1.compareTo(a2);
        }
    };

    public List<Book> bookSort(ArrayList<Book> unsorted, String param) {
        List<Book> sorted = new ArrayList<Book>();
        sorted = unsorted;
        if(param == "title") {
            Collections.sort(sorted, titleComparator);
        }
        else if(param == "year") {
            Collections.sort(sorted, yearComparator);
        }
        else if(param == "author") {
            Collections.sort(sorted, authorComparator);
        }
        return sorted;
    }
    
}