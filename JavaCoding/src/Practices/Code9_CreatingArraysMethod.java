package Practices;

import java.util.Arrays;

public class Code9_CreatingArraysMethod {

	public static void main(String[] args) {

		
		System.out.println(Arrays.toString(fizzArray3(5,10)));
		System.out.println(Arrays.toString(fizzArray3(11,18)));
		System.out.println(Arrays.toString(fizzArray3(1,10)));
			
		}
	public static int[] fizzArray3(int i, int j) {
		
		int n = j-i;
		int[] arr = new int[n];
		
	for (int x = 0; x < n; x++) {
		
		arr[x] = i++;
		
	}
	return arr;
	}
}