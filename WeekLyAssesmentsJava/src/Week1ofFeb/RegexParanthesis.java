package Week1ofFeb;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexParanthesis {
	
	public static boolean regexpattern(String s) {
		Stack<Character> ch=new Stack<>();
		char[] ch1=s.toCharArray();
		for(char i:ch1) {
			if(i=='{' || i=='[' || i=='(') {
				ch.add(i);
			}
			else if((i=='}' && ch.peek()=='{') || (i==')' && ch.peek()=='(') || (i==']' && ch.peek()=='[')) {
				ch.pop();
			}
		}
		return ch.empty();
		// TODO Auto-generated method stub
		

	}
	public static void main(String args[]) {
		String s="[()]{}{[()()]()}";
		System.out.println(regexpattern(s));
	}

}
