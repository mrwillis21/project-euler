package net.mrwillis.euler;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 {
	
	private long fibSum;
	private String fibSumString;
	
	public Problem2(long maxValue) {
		fibSum = findFibSum(maxValue);
		fibSumString = Long.toString(fibSum, 10);
	}
	
	@Override
	public String toString() {
		return fibSumString;
	}
	
	private long findFibSum(long maxValue) {
		// Assume error checks. numTerms must be positive.
		long sum = 0;
		long first = 0;
		long second = 1;
		long next = first + second;
		while(next <= maxValue) {
			sum += ((next & 1) == 0) ? next : 0;
			first = second;
			second = next;
			next = first + second;
		}
		return sum;
	}
}