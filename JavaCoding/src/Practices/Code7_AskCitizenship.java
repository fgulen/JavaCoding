package Practices;

import java.util.Scanner;

public class Code7_AskCitizenship {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 
			int seniorCitizens;
			int nonSeniorCitizen;
			
			System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
			seniorCitizens=sc.nextInt();
			nonSeniorCitizen=sc.nextInt();
			System.out.println("What is new citizen's age?");
			int newCitizenAge=sc.nextInt();
			
			if(newCitizenAge>=65) {
				System.out.println("Senior Citizen");
				seniorCitizens+=1;
			}else {
				System.out.println("Non-Senior Citizen");
				nonSeniorCitizen+=1;
			}
			
			System.out.println("New seniorCitizens count "+seniorCitizens+"\n"+"New nonSeniorCitizens count "+nonSeniorCitizen);
			
	    
	  }
}