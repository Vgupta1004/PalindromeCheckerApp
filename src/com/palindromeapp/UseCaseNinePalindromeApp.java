/**
 * Use Case 9: Recursive Palindrome Checker
 * 
 * This class validates palindrome using recursion
 * 
 * Characters are compared from outer positions
 * moving inwards using recursive calls
 * 
 * @author vgup3012
 */
package com.palindromeapp;

/**
 * Application Entry point for UC9
 */
public class UseCaseNinePalindromeApp {
	
	/**
	 * 
	 * @param s		The input String
	 * @param st	The starting index
	 * @param e		The ending index
	 * @return		true, if palindrome otherwise false
	 */
	private static boolean check(String s, int st, int e) {
		if(st>=e) {
			return true;
		}
		else if (s.charAt(e) != s.charAt(st)) {
			return false;
		}
		return check(s, ++st, --e);
	}

	/**
	 * @param args Command line Arguments
	 */
	public static void main(String[] args) {
		
		String ip = "madam";
		boolean isPalindrome = check(ip, 0, ip.length()-1);
		System.out.println("Input: " + ip + "\nIs Palindrome? " + isPalindrome);

	}

}
