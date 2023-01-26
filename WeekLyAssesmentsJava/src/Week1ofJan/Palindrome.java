package Week1ofJan;

import java.util.*;
/*
Checking Palindrome
Given a string "abc" write a function to check if the given string is palindrome or not.
For Example:
racecar -> true
madam -> true
kavitha -> false
keyboard -> false
*/

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		StringBuilder strb=new StringBuilder(str);
		strb.reverse();
		String revstr1=strb.toString();
		if(str.equals(revstr1)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=sc.next();
		if(isPalindrome(str1)) {
			System.out.println("Given string "+str1+" is a Palindrome");
		}
		else {
			System.out.println("Given string "+str1+" is not a palindrome");
		}
		
		

	}

}
