package com.basic;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the Rows");

		int rows = sc.nextInt();

		

		/*for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
				
			}

			System.out.println("");
		}*/
		 for (int i = 0; i <= rows; i++) 
	        {
	            
	             
	            for (int j = 1; j < i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	           
	             
	            for (int j = i; j <= rows; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }

		sc.close();
	}

}
