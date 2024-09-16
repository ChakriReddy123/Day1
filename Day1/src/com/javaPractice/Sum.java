package com.javaPractice;
import java.util.*;
public class Sum {

	int calculateSum(int n) { 
		int sum=0,i=1;
		while(n!=0) {
			if(i%3 ==0 || i%5==0) {
				sum+=i;
				n--;
			}
			i++;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(new Sum().calculateSum(n));
	}

}
