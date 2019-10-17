package CodingSamples;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price in cents:");
		
		int itemPrice=0;
		int quarters, dimes, nickels;
		int paid=100;
		
		itemPrice=sc.nextInt();
		
		int remain= paid-itemPrice;
		quarters=remain/25;
		dimes=(remain%25)/10;
		nickels=((remain%25)%10)/5;
		

		if (itemPrice<25 || itemPrice>100 || itemPrice%5!=0) {
			System.out.println("Invalid price!");
		}else {
			System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
		}
    
	}

}
