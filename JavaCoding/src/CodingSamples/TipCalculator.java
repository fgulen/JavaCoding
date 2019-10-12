package CodingSamples;

import java.util.Scanner;

public class TipCalculator {

	  public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				
				System.out.println("Split:");
				String split =sc.nextLine();
				
				System.out.println("Number of people:");
				int numOfPeople=sc.nextInt();
				
				System.out.println("Check amount:");
				double amount=sc.nextDouble();
				
				System.out.println("Service Quality:");
				String service=sc.next();
				tipcalc(amount,service);
				
				System.out.println("Number of people entered:"+countMan(numOfPeople));
				
				System.out.println("Total to pay: "+(amount+ tipcalc((int)amount,service)));
				System.out.println("Total tip: "+tipcalc(amount,service));
				
				if(!split.equals("yes")){
					double perPerson=(amount/numOfPeople);
					System.out.println("Total per person: "+(perPerson+  (tipcalc((int)amount,service))/numOfPeople) );
					System.out.println("Tip per person: "+ (tipcalc((int)amount,service))/numOfPeople);
				}
			}

			public static String countMan(int People) {
				String peopleShape = " ";
				
				for (int i = 0; i < People; i++) {
					peopleShape+="&";
				}
				return peopleShape;
			}

			private static double tipcalc(double amount, String serQua) {
				double tip;
				
				if(serQua.equalsIgnoreCase("Excellent")) {
					return tip=amount*0.25;
				}else if(serQua.equalsIgnoreCase("Great")) {
					return tip=amount*0.2;
				}else if(serQua.equalsIgnoreCase("Good")) {
					return tip=amount*0.15;
				}else if(serQua.equalsIgnoreCase("Fair")) {
					return tip=amount*0.1;
				}else if(serQua.equalsIgnoreCase("Poor")) {
					return tip=amount*0.05;
				}else {
					return tip=amount*0;
			} 
	}
}