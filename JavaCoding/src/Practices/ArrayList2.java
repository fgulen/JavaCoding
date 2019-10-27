package Practices;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> li=new ArrayList<>();
		li.add("java");
		li.add("js");
		
		ArrayList<String> li2=new ArrayList<>();
		li2.add("C++");
		li2.add("C#");
		
		li2.addAll(li);
		System.out.println(li2.toString());
		
		
		ArrayList<String> shplist=new ArrayList<>();
		
		shplist.add("towel");
		shplist.add("soap");
		shplist.add("paste");
		
		System.out.println(shplist.size());
		System.out.println(shplist.toString());
		System.out.println(shplist.get(0)+shplist.get(shplist.size()-1));
		
		shplist.remove("paste");
		System.out.println(shplist.toString());
		
ArrayList<String> cities=new ArrayList<String>();
		
		cities.add("Koln");
		cities.add("Yozgat");
		cities.add("Tokyo");
		cities.add("Mus");
		cities.add("DC");
		
		for (int i = 0; i < cities.size(); i++) {
			 
			System.out.print(cities.get(i)+" ");
		}
		
		for(String value:cities) {
			System.out.println(value+ " ");
		}
		
		cities.add(0,"Istanbul");
		System.out.println(cities.toString());
		
		int indx=cities.indexOf("Mus");
		System.out.println(indx);
		
		
		cities.clear();
		System.out.println(cities.isEmpty());

			
	}

}
