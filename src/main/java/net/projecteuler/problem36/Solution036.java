package net.projecteuler.problem36;

import net.projecteuler.solution.AbstractSolution;
import net.projecteuler.util.Palindrome;

public class Solution036 extends AbstractSolution {

	@Override
	public String getProblemDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.\n")
				.append("Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.\n")
				.append("(Please note that the palindromic number, in either base, may not include leading zeros.)");

		return sb.toString();
	}

	@Override
	public String getProblemDescriptionUrl() {
		return "http://projecteuler.net/problem=36";
	}

	@Override
	public void solve() {
		int sum = 0;

		for (int i = 0; i < 1000000; i++) {
			if (Palindrome.isPalindrome(getNumericString(i))
					&& Palindrome.isPalindrome(getBitString(i))) {
				sum += i;
				System.out.print(i);
				System.out.print("\t- ");
				System.out.println(getBitString(i));
			}
		}

		System.out.println("\nSum: " + sum);
	}


	
	protected static String getBitString(int val) {
		return Integer.toBinaryString(val);
	}

	protected static String getNumericString(int val) {
		return "" + val;
	}

	public static void main(String... args) {
		Solution036 sol = new Solution036();
		sol.execute();
	}
}
