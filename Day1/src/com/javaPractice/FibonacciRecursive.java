package com.javaPractice;
import java.util.*;
public class FibonacciRecursive {

	 int fibo(int n) {
		if(n==1 || n==2) { //1 1 2 3 5 8 13
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(new FibonacciRecursive().fibo(n));
	}

}
