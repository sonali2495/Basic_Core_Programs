package com.bridgelabz.Basic_Core_Programs;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		int n,i;
		float sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
		sum=sum+(float)1/i;
		}

		System.out.println("Sum of n terms in harmonic series=" +sum);
		}

}
