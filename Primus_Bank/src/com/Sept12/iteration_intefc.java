package com.Sept12;

import java.util.ArrayList;
import java.util.Iterator;

public class iteration_intefc {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("MONDAY");
		str.add("tuesday");
		str.add("wednesday");
		str.add("thursday");
		str.add("friday");
		str.add("saturday");
		str.add("sunday");
		System.out.println("weeked days: "+str.get(5)+","+str.get(6));
		//iterator is an interface ,x folding position of collection
		Iterator<String> x=str.iterator();
		//iterate by hasnext until x becomes false
		while(x.hasNext()) {
			System.out.println(x.next());
			
			
		}
		

	}

}
