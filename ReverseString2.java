package week2.day1.package1;

public class ReverseString2 {

	public static void main(String[] args) {
		// Here is the input
				String test = "feeling good";
				char ch ; String reverse="";
				for (int i=0;i<test.length();i++) {
					ch=test.charAt(i);
					reverse=ch+reverse;
				
				}
				System.out.println(reverse);

	}
}
