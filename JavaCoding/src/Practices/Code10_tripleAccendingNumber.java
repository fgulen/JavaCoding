package Practices;

public class Code10_tripleAccendingNumber {

	public static void main(String[] args) {

		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9}; //false
		
		System.out.println(method(x));
		System.out.println(method(y));
		System.out.println(method(z));


	}

	public static boolean method(int[] z) {

		for (int i = 0; i < z.length-3; i++) {
			
			if( z[i]+1 == z[i+1] && z[i+1] == z[i+1]+1 ) {
				
				return true;
			}
		}
		return false;
	}

}
