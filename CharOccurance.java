package week2.day1.package1;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";
		int count =0;
		char[] charArray = str.toCharArray();
		System.out.println(str.length());
		for (int i=0; i< charArray.length;i++) {
			if(charArray[i] == 'e')
				count +=1;	
		}
		System.out.println(count);
	}

}
