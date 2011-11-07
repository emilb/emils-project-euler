package net.projecteuler.problem036;

import net.projecteuler.problem036.Solution036;

import org.junit.Test;
import static org.junit.Assert.*;

public class Solution036Test {

	@Test
	public void testGetBitString() {
		assertEquals("0", Solution036.getBitString(0));
		assertEquals("10", Solution036.getBitString(2));
	}
	
	@Test
	public void testGetNumericString() {
		assertEquals("0", Solution036.getNumericString(0));
		assertEquals("2", Solution036.getNumericString(2));
	}
}
