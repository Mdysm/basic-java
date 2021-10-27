package com.Sept12;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<Object> str=new ArrayList<Object>();
		
str.add("india");
str.add('a');
str.add(3.6788);
str.add("boolean");
str.add(3455);
System.out.println(str.get(4));
for(Object each:str) {
	System.out.println(each);
}
System.out.println("=====================================");
for(int i=0;i<=4;i++) {
	System.out.println(str.get(i));
}

	}

}
