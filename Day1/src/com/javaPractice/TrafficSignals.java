package com.javaPractice;
import java.util.*;
public class TrafficSignals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Select any one \n 1) red \n 2) yellow \n 3) green");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1: 
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("ready");
			break;
		case 3:
			System.out.println("go");
			break;
		default:
			System.out.println("Select a valid option");
		}
	}

}
