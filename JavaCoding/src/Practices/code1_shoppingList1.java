package Practices;

import java.util.Scanner;

public class code1_shoppingList1 {

	public static void main(String[] args) {
	      String item1;
		    String item2;
		    String item3;
		    String report;
		    
		  double price1;
		  double price2;
		  double price3;
		  
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter Item1 and its price:");
		    
		    item1=scan.nextLine();
		    price1=scan.nextDouble();
		    scan.nextLine();
		    
		    System.out.println("Enter Item2 and its price:");

		    item2=scan.nextLine();
		    price2=scan.nextDouble();
		    scan.nextLine();
		    
		    System.out.println("Enter Item3 and its price:");

		    item3=scan.nextLine();
		    price3=scan.nextDouble();
		    scan.nextLine();
		    
	        report= "Item1: "+ item1 +" Price: "+ price1+ 
	        		", Item2: "+ item2 +" Price: "+ price2+ 
	        		", Item3: " + item3 +" Price: "+price3 +
			    	"\nTotal price: "+(price1+price2+price3);
			     	    	    
		    System.out.println(report);

		    
		

	}

}
