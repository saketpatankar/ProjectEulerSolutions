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
		//Start timer to calculate efficiency
		long start = System.nanoTime();
		
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
		
		long stop = System.nanoTime();
	    System.out.println("Time: " + (stop - start) / 1000 + " microseconds");
	    
	    //Found an optimized method for the same... 
	    optimizedMethod();
	}
	
	//Using arithmatic formulae for calculating the sum of n numbers and the square of sum of n numbers 
	//We get the following solutions.
	public static void optimizedMethod(){

		long start = System.nanoTime();
		long sum = 0;
		long squared = 0;
		long result = 0;
		 
		int N = 100;
		 
		sum = N * (N+1)/ 2;
		squared = (N * (N + 1) * (2 * N + 1)) / 6;
		
		result = sum * sum - squared;
		
		System.out.println("Difference is for new method :" + result);
		
		long stop = System.nanoTime();
	    System.out.println("New Time: " + (stop - start) / 1000 + " microseconds");
		
	}

}
