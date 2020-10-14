package test;

import java.util.Scanner;

public class change {
public static void main(String[] args) {
	int count=0;
	int count1=0;
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		 String str=sc.next();
		 char[] c=str.toCharArray();
		
		 for(int i=0;i<=c.length-1;i++) {
			 if(c[i]>='a'&&c[i]<='z') {
				 count++;
				c[i]=(char)((int)c[i]-32);
				 System.out.print(c[i]);
			 }else
				 if(c[i]>='A'&&c[i]<='Z') {
					 count1++;
					 c[i]=(char)((int)c[i]+32);
					 System.out.print(c[i]);
				 }
		 } 	
		 System.out.println();
		 System.out.println("ด๓ะด:"+count1);
	     System.out.print("ะกะด:"+count);
		  
	} 
  
  
	}
	}

