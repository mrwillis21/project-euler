package net.mrwillis.euler;


public class Problem7 {
	
	private int nthPrime;
	private String nthPrimeString;
	
	public Problem7(int n) {
		// Assume the upper bound is < Integer.MAX_VALUE;
		int upperBound = (int) ((n * (Math.log(n) + Math.log(Math.log(n)) + 8))); // + 1 because we're going to truncate.
		nthPrime = sieve(upperBound, n);
		nthPrimeString = Long.toString(nthPrime, 10);
	}
	
	@Override
	public String toString() {
		return nthPrimeString;
	}
	
	private int sieve(int upperBound, int n) {
		boolean[] sieve = new boolean[upperBound+1];
		
		// Using reverse logic to avoid prepopulating the array with "true".
		for(int i = 2; i * i <= upperBound; ++i) {
			if(!sieve[i]) {
				for(int j = i; i*j <= upperBound; ++j) {
					sieve[i*j] = true;
				}
			}
		}
		
		int numPrimes = 0;
		for(int i = 2; i <= upperBound; ++i) {
			if(!sieve[i] && ++numPrimes == n) {
				return i;
			}
		}
		return -1;
	}
}
