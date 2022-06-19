package week2.day1.package1;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		int i;		
		for ( i=0;i < test.length();i++ ) {
			//Convert the String to character array
			char ch = test.charAt(i);		
			if(Character.isLetter(ch))
			{
				letter += 1;
			}
			else if(Character.isDigit(ch))
			{
				num += 1;
			}
			else if(Character.isSpaceChar(ch))
			{
				space += 1;
			}
			else
			{
				specialChar += 1;
			}
		}
		System.out.println("count of letter is "+letter);
		System.out.println("count of num is " + num);
		System.out.println("count of space is " + space);	
		System.out.println("count of specialchar is "+ specialChar);

	}
}



