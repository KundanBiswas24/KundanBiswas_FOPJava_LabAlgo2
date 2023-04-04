package com.gl.lab2.qsn2;

import java.util.Scanner;

public class TravellerProblem {
	public static void sort(int arr[]) {

		// iteration for checking all the elements of array
		for(int i=0; i<arr.length-1; i++) {
			int biggest = i;    

			//sorting in descending order to get the bigger amount at the beginning
			for(int j = i+1; j<arr.length; j++) {
				if(arr[biggest]<arr[j]) {
					biggest = j;
				}
			}
			int temp = arr[biggest]; // swap
			arr[biggest] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" :: Traveller Problem :: ");
		System.out.println("\n");

		System.out.println("Enter the size of Currency Denominations : ");
		
		int size = input.nextInt();
		if(size<=0) {  
			System.out.println("Entered Currency Denominations size is not allowed...");
			input.close();
			return;
		}

		int dArr[] = new int[size];

		System.out.println("Enter the Currency Denominations values : ");
		

		for(int i = 0; i<dArr.length; i++) {
			dArr[i] = input.nextInt();
		}

		//calling the method for sorting
		sort(dArr);

		System.out.println("Enter the amount you want to pay : ");
		
		
		int amount = input.nextInt();
		int i = 0;
		int newArr [] = new int[size];

		while(amount>0 && i<dArr.length) { 
			int noOfNotes = amount / dArr[i];

			newArr[i] = noOfNotes;
			amount = amount % dArr[i];
			i++;
		}

		System.out.println("Your payment approach in order to give min no of notes will be : ");
		for(int k = 0; k < newArr.length; k++) {
			
			
			
			if(newArr[k] != 0) {
				System.out.println(dArr[k]+ " : " + newArr[k]);
			}
		}

		input.close();
	}
}
