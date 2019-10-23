package Practices;

import java.util.Scanner;

public class Code11_NumberOfCatDogs {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    
	    String word = scan.next();
	    
		 for (int i = 0; i < word.length()-2; i++) {
				
			   if(word.substring(i,i+3).contains("dog")) {
					countOfDogs++;
			   }
			   
			   if(word.substring(i,i+3).contains("cat")) {
					countOfCats++;
			   }		  
		}
		   
		   if(countOfCats==countOfDogs) {
			   
				  System.out.println(true);
				  
			   }else {
				   
				   System.out.println(false);
			   }
	   	

	}

}
