package net.mrwillis.euler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 **/
public class Problem1 {

	private long sum;
	private String sumString;
	
	public Problem1(int below) {
		sum = findSum(below);
		sumString = Long.toString(sum, 10);
	}
	
	@Override
	public String toString() {
		return sumString;
	}
	
	private long findSum(int below) {
		// Assume error checks, below must be positive.
		long sum = 0;
		for(long i = 1; i < below; ++i) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
