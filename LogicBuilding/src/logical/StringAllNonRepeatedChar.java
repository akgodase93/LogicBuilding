package logical;

public class StringAllNonRepeatedChar {
	public static void main(String[] args) {
		
		String input="automation";
		char[] arr=input.toCharArray();
		
		for(char a: arr)
		{
			if(input.indexOf(a) == input.lastIndexOf(a))
			{
				System.out.print(a+" ");
			}
		}
		
	}

}
