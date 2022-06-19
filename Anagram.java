package week2.day1.package1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int len1=text1.length();
		int len2=text2.length();
		if(len1 == len2) {
		char[] str1 = text1.toCharArray();
		char[] str2 = text2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		boolean result = Arrays.equals(str1, str2);
		if (result == true) {
			System.out.println(text1 + " and "+ text2+ " is anagram");
		}
		else
			System.out.println("both are not anagram");
		
		}
		else
			System.out.println("Not anagram");


	}

}
