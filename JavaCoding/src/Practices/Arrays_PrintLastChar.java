package Practices;

import java.util.Scanner;

public class Arrays_PrintLastChar {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		 String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   
		 for (int i = 0; i < words.length; i++) {
			 
			 if(words.length>2) {
				 
				 System.out.println( words[i].substring(0,1) + words[i].substring(words[i].length()-1,words[i].length()));
			 }
			
		}
	}

}
