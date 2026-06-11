package logical;

public class StringPangram {
	public static void main(String[] args) {
		
		String input="The quick brown fox jumps the over lazy dog";
		input=input.toLowerCase();
		
		boolean result=checkPangram(input);
		
		if(result)
		{
			System.out.println("Given string is Pangram..!");
		}
		else
		{
			System.out.println("Given string is not an Pangram..!!");
		}
	}
	
	public static boolean checkPangram(String input)
	{
		if(input.length()<26)
		{
			return false;
		}
		
		for(char i='a'; i<='z'; i++)
		{
			if(input.indexOf(i) < 0)
			{
				return false;
			}
			
		}
		return true;
	}

}
