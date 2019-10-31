package Practices;

import java.util.Scanner;

public class ShortestWord {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 String[] str = {scan.next(), scan.next(), scan.next(), 
		                 scan.next(), scan.next(), scan.next()};
		 
		 String shortW=str[0];
		 
		 
		 for (int i = 1; i < str.length; i++) {
				
			 
			 if(str[i].length() < shortW.length()){
				 
				 shortW=str[i];
			 }
		 
			
		 }
		 
		 System.out.println(shortW);
		 
	}
	
}