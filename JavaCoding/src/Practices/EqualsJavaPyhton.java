package Practices;

import java.util.Scanner;

public class EqualsJavaPyhton {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    
	    int countJava=0;
    	int countPyhton=0;
	    
	    for (int i = 0; i < sentence.length()-4; i++) {
	    	
	    	if(sentence.substring(i,i+4).equals("java")) {
	    		countJava++;
	    	}
	
		}
	    
	    for (int i = 0; i < sentence.length()-5; i++) {
	    	
	    	if(sentence.substring(i,i+6).equals("python")) {
	    		countPyhton++;
	    	}
	
		}
	    
	    if(countJava==countPyhton) {
	    	System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }
	}

}
