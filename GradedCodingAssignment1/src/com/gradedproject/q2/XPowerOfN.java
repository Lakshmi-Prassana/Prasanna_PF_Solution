package com.gradedproject.q2;

import java.util.Scanner;

public class XPowerOfN {
	public static long power(int a,int b) {
		if(b == 0) {
			return 1;
		} else {
			return power(a,b-1)*a;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number x :");
		int x = sc.nextInt();
		System.out.println("Enter the base number N :");
		int N = sc.nextInt();
		long res=power(x,N);
		System.out.println(res);
	}

}
