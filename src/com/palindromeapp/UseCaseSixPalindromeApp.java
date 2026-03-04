/**
 * Use Case 6 : Queue + Stack based approach
 * 
 * This class demonstrates palindrome validation using
 * two different data structured
 * 
 * Queue - First in First out(FIFO)
 * Stack - Last in First out(LIFO)
 */
package com.palindromeapp;

import java.util.*;

/**
 * Application entry point for UC6
 */
public class UseCaseSixPalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "civic";
		
		Queue<Character> q = new LinkedList<>();
		Stack<Character> s = new Stack<>();
		
		for(char c: ip.toCharArray()) {
			s.push(c);
			q.add(c);
		}
		
		boolean flag = true;
		
		while(!q.isEmpty()) {
			if(s.pop() != q.poll()) {
				flag = false;
			}
		}
		
		System.out.println("Input: " + ip);
		System.out.println("is Palindrome? " + flag);
		
	}

}
