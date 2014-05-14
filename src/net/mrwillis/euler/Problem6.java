package net.mrwillis.euler;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
	private long diff;
	private String diffString;
	
	public Problem6(long n) {
		long sum = (n * (n + 1)) >> 1;
		long sumSquares = ((n * (n + 1) * (2*n + 1)) / 6);
		diff = (sum * sum) - sumSquares;
		diffString = Long.toString(diff, 10);
	}
	
	@Override
	public String toString() {
		return diffString;
	}
}
