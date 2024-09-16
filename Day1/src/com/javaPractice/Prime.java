package com.javaPractice;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			int flag=0;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}

}
