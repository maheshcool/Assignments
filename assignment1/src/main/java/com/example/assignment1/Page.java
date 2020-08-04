package com.example.assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Page {

	public static void pageShow() {
		System.out.println("1.Buy books");
		System.out.println("2.Cart");
		System.out.println("3.Logout");
	}

	
	static String green = "\033[0;32m", red = "\033[0;31m" ;
	
	
	public static void main(String[] args) {
		Stock s = new Stock();
		s.maintain_Stock();
		int entry = 10;
		Cart cart = new Cart();
		while(entry!=3)
		{
			System.out.println("\n");
			pageShow();
			Scanner sc = new Scanner(System.in);
			System.out.print("Proceed to selection: ");
			entry = sc.nextInt();
			if(entry < 1 || entry > 3) {
				System.out.println("!Invalid Entry");
				// pageShow();
				continue;
			}

			switch(entry) {
				case 1:
						int entry1 = 5;
						while(entry1 != 2) {
							System.out.print("Enter the book name: ");
							Scanner sc1 = new Scanner(System.in);
							String bookName = sc1.nextLine();
							if(s.findBook(bookName)) {
								s.getBook(bookName).showBookDetails();
								System.out.println("1. Add to cart \n2. exit");
								entry1 = sc1.nextInt();
								if(entry1 == 1){
									cart.addCart(s.getBook(bookName));
									System.out.println("1.Buy another book \n2. Exit");
									entry1 = sc1.nextInt();
								} 
							}
							else {
								System.out.println("This book is not available riht now");
							}
						// sc1.close();
					}
					continue;
						

				case 2: 
						System.out.print("Payment amount: " + cart.showPrice()+ "\nMake Payment: ");
						int paid = sc.nextInt();
						while(paid < cart.showPrice()) {
							System.out.println(red + "Insufficient amount!");
							System.out.print ("Please pay the valid bill:");
							paid = sc.nextInt();
						}		
						System.out.println("Payment successful.");
						entry = 3;
						break;
				
				case 3: System.out.println("Thanks for shopping with us.");
						entry = 3;
						break;
				
				default: pageShow();
			}
				
		}
		System.out.println(green + ">>>>>Thanks for shopping<<<<<");
	}

}
