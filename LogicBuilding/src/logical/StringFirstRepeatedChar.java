package logical;

public class StringFirstRepeatedChar {

	public static void main(String[] args) {
		
		String input="moottoo";
		char []arr=input.toCharArray();
		
		for(char a: arr)
		{
			if(input.indexOf(a) != input.lastIndexOf(a))
			{
					System.out.print(a+" ");
					break;
			}
		}
	}
}
