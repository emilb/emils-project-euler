package net.projecteuler.problem004;

import net.projecteuler.solution.AbstractSolution;
import net.projecteuler.util.Palindrome;

public class Solution004 extends AbstractSolution {

	@Override
	public String getProblemDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"A palindromic number reads the same both ways. The largest palindrome made from\n") 
				.append("the product of two 2-digit numbers is 9009 = 91 x 99.\n\n")
				.append("Find the largest palindrome made from the product of two 3-digit numbers.");

		return sb.toString();
	}

	@Override
	public String getProblemDescriptionUrl() {
		return "http://projecteuler.net/problem=4";
	}

	@Override
	public void solve() {
		int slowCounter = 999;
		int highestPalindromeProduct = 0;
		
		while (slowCounter > 99) {
			for (int i = 999; i > 99; i--) {
				int product = slowCounter * i;
				
				// Check if this product is higher than the
				// currently known highest palindrome, if so
				// check i the product is a palindrome.
				if (product > highestPalindromeProduct && 
						Palindrome.isPalindrome(product + "")) {
					if (product > highestPalindromeProduct)
						highestPalindromeProduct = product;
					
					// When a palindrome for the value of this slowCounter is
					// found there is no point in continuing downwards, any other
					// palindrome found will be smaller
					continue;
				}
				
				// If slowCounter is less than the SQRT of the highest palindrome
				// found so far we can exit because no other product will be higher 
				// (that is not already palindrome checked)
				if (slowCounter < Math.sqrt(highestPalindromeProduct))
					break;
			}
			slowCounter--;
		}
		
		System.out.println("Largest palindrome from product of two three digit numbers: " + highestPalindromeProduct);
	}

	public static void main(String ... args) {
		Solution004 solution = new Solution004();
		solution.execute();
	}
}
