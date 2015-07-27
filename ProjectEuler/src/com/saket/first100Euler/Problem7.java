package com.saket.first100Euler;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

public class Problem7 {

	public static void main(String[] args) {
		int count = 0;
		int prime = 0;
		while (prime <= 10001) {
			if (isPrime(count) == true) {
				prime++;
				if (prime == 10001) {
					System.out.println(count + " is the 10001st prime number");
				}
			}
			count++;
		}
	}

	public static boolean isPrime(long n) {
		    if (n < 2) return false;
		    if (n == 2) return true;
		    if (n % 2 == 0) return false;
		    if (n < 9) return true;
		    if (n % 3 == 0) return false;
		    long max = (long)(Math.sqrt(n + 0.0)) + 1;
		    for (int i = 5; i <= max; i += 6) {
		        if (n % i == 0) return false;
		        if (n % (i + 2) == 0) return false;
		    }
		    return true;
	}

}
