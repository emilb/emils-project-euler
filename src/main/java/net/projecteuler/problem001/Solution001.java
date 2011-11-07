package net.projecteuler.problem001;

import net.projecteuler.solution.AbstractSolution;

public class Solution001 extends AbstractSolution {

	@Override
	public String getProblemDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"If we list all the natural numbers below 10 that are multiples of 3 or 5,\n")
				.append("we get 3, 5, 6 and 9. The sum of these multiples is 23.\n\n")
				.append("Find the sum of all the multiples of 3 or 5 below 1000.");

		return sb.toString();
	}

	@Override
	public String getProblemDescriptionUrl() {
		return "http://projecteuler.net/problem=1";
	}

	@Override
	public void solve() {

		int totalSum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				totalSum += i;
		}
		System.out.println("Sum of multiples of 3 or 5 below 1000: " + totalSum);
	}

	public static void main(String... args) {
		Solution001 solution = new Solution001();
		solution.execute();
	}
}
