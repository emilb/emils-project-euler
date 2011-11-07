package net.projecteuler.problem002;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution002Test {

	@Test
	public void testGetNextFibonacci() {
		
		Solution002 sol = new Solution002();
		
		int[] firstTenFibonacci = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
		for (int fib : firstTenFibonacci) {
			assertEquals(fib, sol.getNextFibonacci());
		}
	}
}
