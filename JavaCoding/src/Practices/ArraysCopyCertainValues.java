package Practices;

import java.util.Arrays;

public class ArraysCopyCertainValues {



	public static void main(String[] args) {
		
	    System.out.println("-----EXAMPLE RUN ---------");
	    
	    String[] numbers = {"zero", "one", "two","three","four"};
	    
	   System.out.println(Arrays.toString(getWithE(numbers)));
	    
	    //getWithE(numbers);
	    
	  }
	  	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    for (int i = 0; i < arr.length; i++) {
	    	
			String[] fewValues=new String[i+1];	
	    	
	    	if(arr[i].substring(0,arr[i].length()-1)=="e") {

	    		fewValues[i]=arr[i];		

	    	}else {
	    		return null;
	    	}

		}
	    	    
	 return fewValues;

	  }

	}
