package com.example.assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    int entry;

    public void mainPage() {
        System.out.println("1.Buy books");
		System.out.println("2.Cart");
        System.out.println("3.Logout");
    }

    public void searchBook(Cart cart, Stock s) {
        int entry1 = 5;
        while(entry1 != 2) {
            System.out.print("Enter the book name: ");
            Scanner sc1 = new Scanner(System.in);
            String bookName = sc1.nextLine();
            if(s.findBookByTitle(bookName)) {
                ArrayList<Book> temp = (ArrayList)s.getByTitle(bookName);
                entry1 = 3;
                while(entry1 == 3) {
                    System.out.println("Books: ");
                    s.showListView(temp);
                    System.out.print("Please enter the book number you want to see the detail: ");
                    entry1 = sc1.nextInt();
                    temp.get(entry1 - 1).showBookDetails();
                    System.out.println("1. Add to cart \n2. exit \n3.Back");
                    entry1 = sc1.nextInt();
                    if(entry1 == 1){
                        cart.addCart(temp.get(entry1 - 1));
                        System.out.println("1.Buy another book \n2. Exit \n3.Back");
                        entry1 = sc1.nextInt();
                        if(entry1 == 2 || entry1 ==1) {
                            break;
                        }
                        else if(entry1 == 3 ) {
                            continue;
                        }
                    }
                    else if(entry1 == 2) {
                        break;
                    }
                    else if 
                    System.out.println("2. exit \n3.Back");
                    entry1 = sc1.nextInt();
                }
                if(entry1 ==1 ) {
                    continue;
                }
            }
            else {
                System.out.println("This book is not available riht now");
            }
        }
        
    }

}