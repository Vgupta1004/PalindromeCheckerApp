/**
 * Use Case 3 - Reverse String Based Palindrome Check
 * 
 * This class checks whether a string is palindrome
 * by reversing the string and comapring it with the original string
 * 
 * @author vgup3012
 */
package com.palindromeapp;

/**
 * Entry point for UC3
 */
public class UseCaseThreePlaindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "level";
		boolean flag = true;
		String ipRev = "";
		
		for(int i = ip.length()-1 ; i>=0; i--) {
			ipRev += ip.charAt(i);
		}
		
		if(!ip.equalsIgnoreCase(ipRev)) {
			flag = false;
		}
		
		System.out.println("Original: " + ip);
		System.out.println("Reversed: " + ipRev);
		System.out.println("Is Palindrome? " + flag);

	}

}
