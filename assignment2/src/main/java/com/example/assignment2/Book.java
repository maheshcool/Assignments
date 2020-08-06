package com.example.assignment2;

import java.util.Comparator;

public final class Book {
    String title, author, isbn, publisher, language, binding, publicationYear;
    int price;

    
    public Book(String title, String author, String isbn, String publisher, String language, String publicationYear, String binding, int price) {     
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.language = language;
        this.publicationYear = publicationYear;
        this.binding = binding;
        this.price = price;
    }

    public void showBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publisher: " + publisher);
        System.out.println("Language: " + language);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Binding: " + binding);
        System.out.println("Price: " + price);
    }

    public void showListView() {
        System.out.print("Title: " + title);
        System.out.print("\tAuthor: " + author);
        System.out.print("\tPublisher: " + publisher);
        System.out.print("\tLanguage: " + language);
        System.out.print("\tPublication Year: " + publicationYear);
        System.out.println("\tPrice: " + price);
    }

}