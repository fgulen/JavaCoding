package Practices;

import java.util.Scanner;

public class ArraysPrinting01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below. 
		//Create another loop for your solution!
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i].length()>2) {
				
				System.out.println(arr[i].substring(0,3));
			}
			
		}
		
		
	}
}