package logical;

/*
 * 
	Input  : "automation"
	Output : u
 *
 */
public class StringFirstNonRepeatedChar2 {
	public static void main(String[] args) {
		
		String input="automation";
		
		char []arr=input.toCharArray();
		
		
		for(char a: arr)
		{
			if(input.lastIndexOf(a) == input.indexOf(a))
			{
				System.out.println("First non repeated character in string is: "+a);
				break;
			}
		}
	}
}
