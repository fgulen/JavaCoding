package Practices;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {


		ArrayList<String> shplist=new ArrayList<>();
		
		shplist.add("towel");
		shplist.add("soap");
		shplist.add("paste");
		
		System.out.println(shplist.size());
		System.out.println(shplist.toString());
		System.out.println(shplist.get(0)+shplist.get(shplist.size()-1));
		
		shplist.remove("paste");
		System.out.println(shplist.toString());
				
	}

}
