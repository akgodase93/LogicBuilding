package logical;

/*
 * 
 			Problem Statement: Reverse Each Word, Keep Word Positions Same
			Input: I Love Java Programming
			Output: I evoL avaJ gnimmargorP
 
 * 
 */
public class StringReverseEachWord {

	public static void main(String[] args) {
		
		String input="I Love Java Programming";
		String[] words=input.trim().split(" ");
		
		for(String word: words)
		{
			String reversedWord="";
			for(int i=word.length()-1; i>=0; i--)
			{
				reversedWord+=word.charAt(i);
			}
			System.out.print(reversedWord+" ");
		}
	}
}
