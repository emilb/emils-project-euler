package net.projecteuler.problem009;

import net.projecteuler.solution.AbstractSolution;

public class Solution009 extends AbstractSolution {

	@Override
	public String getProblemDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"A Pythagorean triplet is a set of three natural numbers, a  b  c, for which, \n\n")
				.append("a^2 + b^2 = c^2\n\n")
				.append("There exists exactly one Pythagorean triplet for which a + b + c = 1000.\n")
				.append("Find the product abc.");

		return sb.toString();
	}

	@Override
	public String getProblemDescriptionUrl() {
		return "http://projecteuler.net/problem=9";
	}

	
	@Override
	public void solve() {
		
		for (int c = 999; c > 1; c--) {
			for (int b = c - 1; b > 1; b--) {
				int a = 1000 - c - b;
				
				if (isPythagoreanTriplet(a, b, c)) {
					System.out.println("Found triplet for a: " + a + " b: " + b + " c: " + c);
					System.out.println("Product abc: " + (a*b*c));
				}
			}
		}

	}

	protected boolean isPythagoreanTriplet(int a, int b, int c) {
		if (a < 0 || a > b || b < 0 || b > c || c < 0)
			return false;
		
		return a*a + b*b == c*c;
	}

	public static void main(String ... args) {
		Solution009 solution = new Solution009();
		solution.execute();
	}
}
