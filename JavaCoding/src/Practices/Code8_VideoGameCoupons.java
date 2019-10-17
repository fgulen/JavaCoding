package Practices;

import java.util.Scanner;

public class Code8_VideoGameCoupons {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter number of coupons:");
		int numCoupons=scan.nextInt();
		
		int candy=numCoupons/10;
		int gumball=(numCoupons%10)/3;
		
		if(numCoupons>=3) {
			System.out.println("Number of Candies: "+candy);
			System.out.println("Number of Gumballs: "+gumball);
			
		}else {
			System.out.println("Not enough coupons");
		}
  }
}