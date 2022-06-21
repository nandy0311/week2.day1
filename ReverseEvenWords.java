package week2.day1.package1;

public class ReverseEvenWords {
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
	public static void main(String[] args) {
		String test= "I am a software tester" ;
		//			  0 1  2 3         4
		String [] array = test.split(" ");
		for (int i=0; i< array.length;i++) {
			if(i %2 == 0) {
				System.out.print(" ");
				System.out.print(array[i]+ " ");
			}
			if(i %2 != 0) {
				String word = array[i];
				char[] revword = word.toCharArray();
				for(int j=revword.length-1;j>=0;j--) {
					System.out.print(revword[j]);
					
				}
			}
			
		}
		
		
		
	}
}



