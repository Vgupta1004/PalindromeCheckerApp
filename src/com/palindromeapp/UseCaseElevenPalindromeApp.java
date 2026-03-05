/**
 * Use Case 11: Object Oriented Palindrome Checker
 * 
 * This class demonstrates palindrome validation using
 * object oriented design
 * 
 * @author vgup3012 
 */
package com.palindromeapp;

/**
 * This is the entry point for UC11
 */
public class UseCaseElevenPalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "racecar";
		PalindromeService ps = new PalindromeService();
		
		System.out.println("Input: " + ip + "\nIsPalindrome? " + ps.checkPalindrome(ip));
	}

}

class PalindromeService{
	
	/**
	 * Checks whether the input string is palindrome or not
	 */
	public boolean checkPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		
		boolean flag = true;
		
		while(start<end) {
			if(s.charAt(start) != s.charAt(end)) {
				flag = false;
			}
			start++;
			end--;
		}
		
		return flag;
	}
}
