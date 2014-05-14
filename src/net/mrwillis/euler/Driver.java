package net.mrwillis.euler;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Find the sum of all the multiples of 3 or 5 below 1000.");
		System.out.println(new Problem1(1000));
		System.out.println();
		
		System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.");
		System.out.println(new Problem2(4000000));
		System.out.println();
		
		System.out.println("What is the largest prime factor of the number 600851475143?");
		System.out.println(new Problem3(600851475143l));
		System.out.println();
		
		System.out.println("Find the largest palindrome made from the product of two 3-digit numbers.");
		System.out.println(new Problem4(3));
		System.out.println();
		
		System.out.println("What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?");
		System.out.println(new Problem5(20));
		System.out.println();
		
		System.out.println("Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.");
		System.out.println(new Problem6(100));
		System.out.println();
		
		System.out.println("What is the 10 001st prime number?");
		System.out.println(new Problem7(10001));
		System.out.println();
	}
}
