package net.mrwillis.euler;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
	
	private long lpf;
	private String lpfString;
	
	public Problem3(long num) {
		lpf = lpf(num);
		lpfString = Long.toString(lpf, 10);
	}
	
	private long lpf(long num) {
		long largest = 0;
		long next;
		while(num > 1) {
			next = nextFactor(num);
			num /= next;
			if(next > largest) {
				largest = next;
			}
		}
		
		return largest;
	}
	
	@Override
	public String toString() {
		return lpfString;
	}
	
	// Could improve the factorization algorithm here to improve speed.
	private long nextFactor(long num) {
		for(long i = 2; i <= num; ++i) {
			if(num % i == 0) {
				return i;
			}
		}
		return 1;
	}
}
