package net.mrwillis.euler;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 x 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
	
	private long largestPalindrome;
	private String largestPalindromeString;
	
	public Problem4(int numDigits) {
		largestPalindrome = largestPalindrome(numDigits);
		largestPalindromeString = Long.toString(largestPalindrome, 10);
	}
	
	@Override
	public String toString() {
		return largestPalindromeString;
	}
	
	private long largestPalindrome(int numDigits) {
		// Assume error checks (numDigits must be positive).
		long lowest = (long) Math.pow(10, numDigits-1);
		long highest = (long) (Math.pow(10, numDigits));
		long largest = -1;
		long n;
		for(long i = lowest; i < highest; ++i) {
			for(long j = i; j < highest; ++j) {
				n = i*j;
				if(n > largest && isPalindrome(n)) {
					largest = n;
				}
			}
		}
		return largest;
	}
	
	private boolean isPalindrome(long num) {
		String s = Long.toString(num, 10);
		int i, j;
		for(i = 0, j = s.length()-1; i <= j; ++i, --j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
