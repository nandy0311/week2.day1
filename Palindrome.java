package week2.day1.package1;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not

		String str1="madam";
		char ch;
		String reverse="";
		for (int i=0;i<str1.length();i++) {
			ch=str1.charAt(i);
			reverse=ch+reverse;	

		}
		System.out.println(reverse + " is the reversal string");	
		if (str1.equals(reverse)) 
			System.out.println(str1 + " is a palindrome");
		else
			System.out.println(str1 + " is not a palindrome");
	}


}


