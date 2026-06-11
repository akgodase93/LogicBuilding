package logical;

public class StringReplaceVowelsWithX {
	public static void main(String[] args) {
		
		String input="Hello";
		char[] arr=input.toCharArray();
		StringBuilder sb=new StringBuilder();
		String vowels="AEIOUaeiou";
		
		for(char a: arr)
		{
			if(vowels.indexOf(a) != -1)
			{
				sb.append("x");
			}
			else
			{
				sb.append(a);
			}
		}
		
		System.out.println("Input String '"+input+"' After 'x' replacement: "+sb.toString());
	}
}
