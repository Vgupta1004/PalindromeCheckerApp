/**
 * Use Case 8: Linked List based Palindrome Checker
 * 
 * This class checks whether a string is a plaindrom
 * using a linked list
 * 
 * @author vgup3012
 */
package com.palindromeapp;
import java.util.*;

/**
 * This is the main entry point of the application
 */
public class UseCaseEightPalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "level";
		LinkedList<Character> ll = new LinkedList<>();
		
		for(char c: ip.toCharArray()) {
			ll.add(c);
		}
		
		boolean flag = true;
		
		while(ll.size() > 1) {
			if(ll.removeFirst() != ll.removeLast()) {
				flag = false;
			}
		}
		
		System.out.println("Input: " + ip + "\nIs Palindrome? " + flag);
	}

}
