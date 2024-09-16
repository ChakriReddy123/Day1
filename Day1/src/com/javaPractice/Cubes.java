package com.javaPractice;
import java.util.*;
public class Cubes {

	int sumCubes(int n) {
		int sum=0;
		while(n>0) {
			int s=n%10;
			sum+=(s*s*s);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 
		System.out.println(new Cubes().sumCubes(n));
	}

}
