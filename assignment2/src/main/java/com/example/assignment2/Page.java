package com.example.assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Page {

	static String green = "\033[0;32m", red = "\033[0;31m" ;
	
	public static void main(String[] args) {
		Stock s = new Stock();
		s.maintain_Stock();
		int entry = 10;
		Cart cart = new Cart();
		Show show = new Show();


		while(entry!=3)
		{
			System.out.println("\n");
			show.mainPage();
			Scanner sc = new Scanner(System.in);
			System.out.print("Proceed to selection: ");
			entry = sc.nextInt();
			if(entry < 1 || entry > 3) {
				System.out.println("!Invalid Entry");
				continue;
			}

			switch(entry) {
				case 1:
						show.searchBook(cart, s);
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
				
				default: show.mainPage();
			}
				
		}
		System.out.println(green + ">>>>>Thanks for shopping<<<<<");
	}

}
