/**
 * Use Case 5 - Stack Based Palindrome Checker
 * 
 * This class validates a palindrome using a stack
 * data structure which follows LIFO principle
 * 
 * @author vgup3012
 */
package com.palindromeapp;
import java.util.*;

/**
 * This is the entry point for UC5
 */
public class UseCaseFivePalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "noon";
		Stack<Character> stack = new Stack<>();
		
		for(char c: input.toCharArray()) {
			stack.push(c);
		}
		
		boolean flag = true;
		
		for(char c: input.toCharArray()) {
			if(c != stack.pop()) {
				flag = false;
			}
		}
		
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome? " + flag);
	}

}
