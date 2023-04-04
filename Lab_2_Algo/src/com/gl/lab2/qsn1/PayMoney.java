package com.gl.lab2.qsn1;

import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" ::Welcome to PayMoney:: ");
		System.out.println("\n");

		System.out.println("Enter the size of transaction array : ");
		int tArr_size = input.nextInt();
		
		// logic for input < 0
		if(tArr_size<=0) {  
			System.out.println("Entered Array size is not allowed...");
			input.close();
			return;
		}
		
		int [] tArr = new int[tArr_size];

		System.out.println("Enter the values of array : ");

		for (int i = 0; i < tArr.length; i++) {
			tArr [i] = input.nextInt();
		}

		System.out.println("Enter the total no. of targets that needs to be achieved : ");
		
		int number_target = input.nextInt();

		for(int i = 0; i < number_target; i++) {

			System.out.println("Enter the value of target : ");
			int target_value = input.nextInt();
			int sum = 0;
			for(int j = 0; j < tArr.length; j++) {
				sum+=tArr[j];
				if(sum>=target_value) {
					System.out.println("Target achived after " + (j+1) +" transactions");
					break;
				}
			}
			if (sum<target_value) {
				System.out.println("Given target is not achieved !");
			}
		}
		input.close();	
	}

}
