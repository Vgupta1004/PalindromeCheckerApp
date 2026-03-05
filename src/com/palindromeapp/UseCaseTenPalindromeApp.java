/**
 * Use Case 10: Case insensitive and Space Ignored
 * 
 * This class validates a palindrome after preprocessing
 * the string
 * 
 * This ensures that the plaindrome check is logical
 * rather than character dependent
 * 
 * @author vgup3012
 */
package com.palindromeapp;
import java.util.*;

/**
 * This is the main entry point of the application
 */
public class UseCaseTenPalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "A man a plan a canal panama".toLowerCase();
		LinkedList<Character> ll = new LinkedList<>();
		
		for(char c: ip.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				ll.add(c);
			}
		}
		
		boolean flag = true;
		
		while(ll.size() > 1) {
			if(ll.removeFirst() != ll.removeLast()) {
				flag = false;
			}
		}
		
		System.out.println("Input: " + ip + "\nIsPalindrome? " + flag);

	}

}
