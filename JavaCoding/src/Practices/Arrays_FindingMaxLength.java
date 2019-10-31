package Practices;

import java.util.Scanner;

public class Arrays_FindingMaxLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
			
		for(int i = 0; i < 5;  i++) {
			  
			 words[i] = input.nextLine();
			  
			}
			
		String temp="";
		
		for (int i = 0; i < words.length; i++) {
			
			if(words[i].length()>temp.length()) {
				temp=words[i];
			}			
			
		}
		
		System.out.println(temp);
		
		}

	}