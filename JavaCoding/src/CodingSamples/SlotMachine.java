package CodingSamples;

import java.util.*;

public class SlotMachine {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter money...");
		int money=sc.nextInt();
		
		runGame(money);
		
	}

	private static void stopGame(String answer) {

		if(answer.equalsIgnoreCase("n")) {
			System.out.println("Thank you..\n You earn");
			
		}else {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter money...");
			int money=sc.nextInt();
			runGame(money);
		}
		
	}

	private static void runGame(int money) {
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		String[] fruits= {"Cherries","Oranges","Plums","Bells","Melon","Bars"};
		String answer;
		
		int number1=rn.nextInt(6);
		int number2=rn.nextInt(6);
		int number3=rn.nextInt(6);
		
		System.out.println("--------------------------------------------");
		
		String result="** " +fruits[number1]+" ** "+fruits[number2]+" ** "+fruits[number3]+" **";
		System.out.println(result);
		
		if(fruits[number1]==fruits[number2] && 
		   fruits[number2]==fruits[number3] && 
		   fruits[number1]==fruits[number3]) {
			
			
			System.out.println("--------------------------------------------");
			System.out.println("************ Cong!!!! You won $:"+(money*3)+" ****************");
			System.out.println("Do you wan to play again? y or n");
			int totalMoney=money*3;
			answer=sc.next();
			stopGame(answer);

		}else if((fruits[number1]==fruits[number2] || fruits[number2]==fruits[number3]) || 
				  fruits[number1]==fruits[number3]) {
			
			System.out.println("--------------------------------------------");
			System.out.println("Yeyy...You won :"+(money*2));
			System.out.println("Do you wan to play again? y or n");
			int totalMoney=money*3;
			answer=sc.next();
			stopGame(answer);
			

		}else {
			System.out.println("--------------------------------------------");
			System.out.println(""
					+ "Sorry.....You lost...");
			System.out.println("Do you wan to play again? y or n");
			
			answer=sc.next();
			stopGame(answer);
			
		}

	}

}
