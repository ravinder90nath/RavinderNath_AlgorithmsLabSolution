package com.algo.labsolution;

import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;


public class CalculateMinimumNotes {
	
	public static void main (String[] args) {
		Scanner inputScan = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int arraySize = inputScan.nextInt();
		int[] array = new int[arraySize];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<arraySize; i++) {
			array[i] = inputScan.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int transactionAmout = inputScan.nextInt();
		
		
		
	}
}
