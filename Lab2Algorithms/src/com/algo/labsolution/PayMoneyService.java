package com.algo.labsolution;
import java.util.Scanner;

public class PayMoneyService {

	public static void main(String[] args) {
		Scanner inputScan = new Scanner (System.in);
		
		System.out.println("Enter the Size of Transaction array");
		int ASize = inputScan.nextInt();
		int[] array = new int[ASize];
		
		System.out.println("Enter the value of array");
		for (int i=0; i<ASize;i++) {
			array[i] = inputScan.nextInt();
		}
		
		System.out.println("Enter the total number of targets that need to be achieved");
		int totalInputs = inputScan.nextInt();
		
		while(totalInputs>0) {
		boolean TargetAchieved = false;
			System.out.println("Enter the value of target");
			int target=inputScan.nextInt();
			
			int sum=0;
			int count = 0;

			for(int value:array) {
				count++;
				sum=sum+value;
				if(target <=sum) {
					TargetAchieved = true;
					System.out.println(String.format("Target achieved after %d Transaction", count));
					break;
				}
			}
			
			if(!TargetAchieved) {
				System.out.println("Given Target is not Achieved ");
			}
			totalInputs--;
		}
		inputScan.close();
	}
}
