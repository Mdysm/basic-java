package com.Sept12;

public class Greater {
   public int a=100,b=10,c=30;
	
	public void mul() {
	if((a>b&&a>c)) {
		
        System.out.println(a +"is big");
	}
		
		else if(b>a&&b>c) {
			System.out.println(b +"is big");
			
		}
		/*else if(b==a||b==c) {
			System.out.println(b +"is big"+a+" "+c);
		}*/
		
		else if(c>a&&c>b) {
			System.out.println(c +"is big");
			
		}
		/*else if(c==a||c==b) {
			System.out.println(b +"is big"+a+" "+c);
		}*/
		
	
		
	}
	
	public static void main(String[] args) {
		
		Greater g=new Greater();
		g.mul();
	}
	}


