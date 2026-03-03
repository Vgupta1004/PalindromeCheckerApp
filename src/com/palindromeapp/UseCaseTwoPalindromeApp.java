/**
 * Use Case 2 - Hardcoded Palindrome Validation
 * 
 * This demonstrates basic Palindrome validation
 * using a hardcoded string value
 * 
 * @author vgup3012
 */
package com.palindromeapp;

/**
 * Application Entry point for UC2
 */
public class UseCaseTwoPalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "madam";
		boolean flag = true;
		for(int i=0;i < ip.length()/2;i++) {
			if(ip.charAt(i)!=ip.charAt(ip.length()-i-1)) {
				flag = false;
			}
		}
		System.out.println("Input Text: " + ip);
		System.out.println("Is it a Palimdrome? " + flag);

	}

}
