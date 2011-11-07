package net.projecteuler.util;

public class Palindrome {

	protected static String reverseString(String s) {
		int len = s.length();
		char reversed[] = new char[len];
		int reverseCounter = len - 1;
		
		for (char c : s.toCharArray()) {
			reversed[reverseCounter--] = c;
		}
		
		return new String(reversed);
	}
	
	public static boolean isPalindrome(String s) {
		return s.equals(reverseString(s));
	}
}
