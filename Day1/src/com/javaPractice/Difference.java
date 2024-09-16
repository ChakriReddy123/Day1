package com.javaPractice;
import java.util.*;
public class Difference {

	int calculateDifference(int n) {
		int sumSquare=0,sum=0;
		for(int i=1;i<=n;i++) {
			sumSquare+=(i*i);
			sum+=i;  //1+4+9+16 - (10)
		}
		int diff=sumSquare-(sum*sum);
		return diff;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(new Difference().calculateDifference(n));
	
	}

}
