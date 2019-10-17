package Practices;

import java.util.Scanner;

public class code6_SecondConverter {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
			System.out.println("Enter seconds:");
			
			int time =sc.nextInt();
			
			int hour=time/3600;
			int min=(time%3600)/60;
			int sec=(time%3600)%60;
			
			System.out.println(hour+" hours, "+min+" minutes, and "+sec+" seconds");
	    
	
	}

}
