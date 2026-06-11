package logical;

/*
 * 
 			Problem Statement: Reverse Each Word, Keep Word Positions Same[Using StringBuilder]
			Input: I Love Java Programming
			Output: I evoL avaJ gnimmargorP
 
 * 
 */

public class StringReverseEachWordStringBuilder {
	public static void main(String[] args) {
		
		String input="I Love Java Programming";
		String words[]=input.trim().split(" ");
		
		StringBuilder result=new StringBuilder();
		
		for(String word: words)
		{
			result.append(new StringBuilder(word).reverse()).append(" ");
		}
		System.out.println(result.toString());
	}

}
