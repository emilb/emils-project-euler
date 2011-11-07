package net.projecteuler.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testReverseString() {
		assertEquals("apa", Palindrome.reverseString("apa"));
		assertEquals("apaapa", Palindrome.reverseString("apaapa"));
		assertEquals("rAcEcAr", Palindrome.reverseString("rAcEcAr"));
		assertEquals("lime", Palindrome.reverseString("emil"));
	}
	
	@Test
	public void testIsPalindrome() {
		assertTrue(Palindrome.isPalindrome("k"));
		assertTrue(Palindrome.isPalindrome("apa"));
		assertTrue(Palindrome.isPalindrome("racecar"));
		assertFalse(Palindrome.isPalindrome("apaa"));
	}
}
