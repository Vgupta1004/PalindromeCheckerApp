/**
 * Use Case 7: Deque Based Optimized Palindrome checker
 * 
 * This class validates a palindrome using Deque
 * (Double ended queue)
 * 
 * @author vgup3012
 */
package com.palindromeapp;
import java.util.*;

/**
 * This is the entry point for the application
 */
public class UseCaseSevenPalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "refer";
		Deque<Character> deque = new ArrayDeque<>();
		
		for(char c: ip.toCharArray()) {
			deque.addLast(c);
		}
		
		boolean flag = true;
		
		while(deque.size()>1) {
			if(deque.removeFirst() != deque.removeLast()) {
				flag = false;
			}
		}
		
		System.out.println("Input: " + ip + "\nIs Palindrome? " + flag);
	}

}