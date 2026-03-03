/**
 * Use Case 4 - Character Based Array Balidation
 * 
 * This case validates a plaindrome
 * by converting the string into character based array and comparing
 * characters using the 2 pointer technique
 */
package com.palindromeapp;

/**
 * This is the entry point for UC4
 */
public class UseCaseFourPalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "radar";
		char[] chars = ip.toCharArray();
		int s = 0;
		int e = chars.length - 1;
		boolean flag = true;
		
		while(s<e) {
			if(chars[s]!=chars[e]) {
				flag = false;
			}
			s++;
			e--;
		}
		
		System.out.println("Input: " + ip);
		System.out.println("Is Palindrome? " + flag);

	}

}
