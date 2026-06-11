package logical;

import java.util.HashSet;

public class StringPangramHashSet {
	public static void main(String[] args) {
		
		String input="The quick brown fox jumps over the lay dog";
		char[] inputArray=input.toLowerCase().toCharArray();
		
		boolean result=checkPangram(inputArray);
		
		if(result)
		{
			System.out.println("The Given String is Pangram..!");
		}
		else
		{
			System.out.println("The Given String is Not an Pangram..!");

		}
	}
	public static boolean checkPangram(char[] input)
	{
		HashSet<Character> hs=new HashSet<Character>();
		for(char c: input)
		{
			if(Character.isLetter(c))
			{
				hs.add(c);
			}
		}
		if(hs.size() ==26)
		{
			return true;
		}
		
		return false;
	}

}
