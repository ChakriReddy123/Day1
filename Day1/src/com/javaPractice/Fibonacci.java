package com.javaPractice;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=1,b=1,c=0;
		int n=sc.nextInt();
		if(n<=2) {
			System.out.println(1);
		}
		else {
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		}
	}

}
