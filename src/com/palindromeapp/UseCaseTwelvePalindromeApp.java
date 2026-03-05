/**
 * Use Case 12: Strategy Pattern
 * 
 * The class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the strategy design pattern
 * 
 * @author vgup3012
 */
package com.palindromeapp;
import java.util.*;

/**
 * This is the entry point for UC12
 */
public class UseCaseTwelvePalindromeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ip = "level";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose the strategy to check palindrome:\n1. Stack Based\n2. Deque Based\nEnter your choice: ");
		int c = sc.nextInt();
		
		PalindromeStrategy ps = switch(c) {
		case 1 -> new StackStrategy();
		case 2 -> new DequeStrategy();
		default -> new DequeStrategy();
		};
		
		System.out.println("\nInput: " + ip + "\nIsPalindrome? " + ps.check(ip));
	}

}

interface PalindromeStrategy{
	boolean check(String s);
}

/**
 * This class is used to implement the Stack Based Strategy
 */
class StackStrategy implements PalindromeStrategy{
	
	@Override
	public boolean check(String s) {
		Stack<Character> stack = new Stack<>();
		boolean flag = true;
		
		for(char c:s.toCharArray()) {
			stack.add(c);
		}
		
		int i = 0;
		while(!stack.isEmpty()) {
			if(stack.pop() != s.charAt(i)) {
				flag = false;
				break;
			}
			i++;
		}
		
		return flag;
	}
	
}

/**
 * This class is used to implement Deque Based Strategy
 */
class DequeStrategy implements PalindromeStrategy{

	@Override
	public boolean check(String s) {
		Deque<Character> dq = new ArrayDeque<>();
		boolean flag = true;
		
		for(char c:s.toCharArray()) {
			dq.add(c);
		}
		
		while(dq.size() > 1) {
			if(dq.removeFirst() != dq.removeLast()) {
				flag = false;
			}
		}
		return flag;
	}
	
}
