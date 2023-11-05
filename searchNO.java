package code;

import java.util.Scanner;

public class searchNO {
	public static void main(String[] args) {
		System.out.println("enter limit");
		Scanner sc=new Scanner(System.in);
		int s,i,lmt;
		lmt=sc.nextInt();
		int a[]=new int[lmt];
		System.out.println("enter number");

		for(i=0;i<lmt;i++) {
			a[i]=sc.nextInt();
		}
		for(i=0;i<lmt;i++) {
			System.out.print(a[i]+",");
			
		}
		System.out.println("enter value to search");
		int q,n=0;
		q=sc.nextInt();
		
		for(i=0;i<lmt;i++) {
			if(a[i]==q) {
				n++;
				System.out.print(q+" is found at ");
		for(i=0;i<lmt;i++) {
			if(a[i]==q) {
				System.out.print((i+1)+",");
			}
		}
		System.out.print("locations");
		System.out.println("");
		System.out.println("the number found");
		
		}
			
	}
		if(n==0) {
			System.out.println(" not found");
		}
	}

}
