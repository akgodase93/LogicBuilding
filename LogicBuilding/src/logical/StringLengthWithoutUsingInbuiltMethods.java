package logical;

public class StringLengthWithoutUsingInbuiltMethods 
{
	public static void main(String[] args) {
		
		String str="Hello World";
		int count=0; 
		
		
		try {
			while(true)
			{
				str.charAt(count);
				count ++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			
		}
			
		System.out.println("Length of String: "+count);
		
	}
}
