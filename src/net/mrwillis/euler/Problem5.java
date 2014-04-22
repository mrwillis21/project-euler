package net.mrwillis.euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
	
	private long smallestDivNumber;
	private String smallestDivNumberString;
	
	public Problem5(int max) {
		smallestDivNumber = findSmallestDivisibleNumber(max);
		smallestDivNumberString = Long.toString(smallestDivNumber, 10);
	}
	
	private long findSmallestDivisibleNumber(int max) {
		// Assume error checks:
		// Integer overflow if max == Integer.MAX_VALUE;
		// max must be positive
		long smallest = 1;
		int[] totalFactorFrequency = new int[max+1];
		int[] currentFactorFrequency = new int[max+1];
		
		// Since we're going backward, as soon as we find a number whose
		// factorization consists of a series of a single prime, we could
		// actually stop searching for the frequency of that number, because
		// we will have found its maximum frequency.
		for(int n = max; n > 1; --n) {
			findFactorFrequency(n, currentFactorFrequency);
			for(int i = 0; i <= n; ++i) {
				if(currentFactorFrequency[i] > totalFactorFrequency[i]) {
					totalFactorFrequency[i] = currentFactorFrequency[i];
				}
				currentFactorFrequency[i] = 0; // Reset the buffer as we go.
			}
		}
		
		for(int i = 0; i < totalFactorFrequency.length; ++i) {
			smallest *= Math.pow(i, totalFactorFrequency[i]);
		}
		return smallest;
	}
	
	// Find the frequency of prime factors for a given number.
	private void findFactorFrequency(int num, int[] buffer) {
		// Assume buffer.length == num + 1;
		int factor;
		while(num > 1) {
			factor = findSmallestFactor(num);
			buffer[factor]++;
			num /= factor;
		}
	}
	
	// Simple integer factorization algorithm.
	// Could be improved by pre-filling an array of
	// primes and only testing those for divisibility.
	private int findSmallestFactor(int num) {
		for(int i = 2; i <= num; ++i) {
			if(num % i == 0) {
				return i;
			}
		}
		return 1;
	}
	
	@Override
	public String toString() {
		return smallestDivNumberString;
	}
}
