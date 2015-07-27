package com.saket.first100Euler;

/*
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers 
 * and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers 
 * and the square of the sum.
 * 
 */
public class Problem6 {

	public static void main(String[] args) {

		//Sum of squares
		long sumOfSquares=0;
		for(int i=1;i<=100;i++){
			sumOfSquares = sumOfSquares + (i*i);
		}
		System.out.println("The sum of squares for first 100 natural numbers is "+ sumOfSquares);
		
		//Square of sums
		long squareOfSums=0;
		for (int j=1;j<=100; j++){
			squareOfSums = squareOfSums + j;
		}
		squareOfSums = (squareOfSums * squareOfSums);
		System.out.println("The square of sums of the first 100 natural numbers is " + squareOfSums);
		
		System.out.println("Difference is : " + (squareOfSums - sumOfSquares));

	}

}
