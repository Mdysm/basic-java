package com.Sept12;

public class Two_dimention_ojb {

	public static void main(String[] args) {
		//store table data into object 
		Object[][] login=new Object[4][2];
		
		login[0][0]="Admin";
		login[0][1]="1234";
		login[1][0]="admin1";
		login[1][1]="Admin";
		login[2][0]="ADNMI2";
		login[2][1]="133FF";
		login[3][0]="ADMI3";
		login[3][1]="A456";
		
		System.out.println(login.length);
		
for(int i=0;i<=3;i++) {
	
	for(int j=0;j<=1;j++) {
		System.out.print("\t"+login[i][j]);
		
	}
	System.out.println();
	
}
System.out.println("======================================================");

	for(Object[] each:login) {
		for(Object value:each) {
		System.out.print("\t"+value);
			}
		System.out.println();

}
}
}