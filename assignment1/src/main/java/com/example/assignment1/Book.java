package com.example.assignment1;

public final class Book {
    String title, author, isbn, publisher, language, binding;
    int publicationYear, price;

    
    public Book(String title, String author, String isbn, String publisher, String language, int publicationYear, String binding, int price) {     
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

    public int add(int a, int b) {
        return a+b;
    }

}