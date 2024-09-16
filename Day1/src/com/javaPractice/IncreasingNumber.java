package com.javaPractice;
import java.util.*;
public class IncreasingNumber {
	boolean checkNumber(int n) {
		int n1=n%10;
		
		while(n>0) {
			n=n/10;
			int n2=n%10;
			if(n1<n2) {
				return false;
			}
			n1=n2;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(new IncreasingNumber().checkNumber(n));
	}

}
