package logical;

import java.util.LinkedHashSet;

public class StringUniqueChars {
	
	public static void main(String[] args) {
		
		String input="dabbacdaab";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		StringBuilder sb =new StringBuilder();
		
		char[] arr=input.toCharArray();
		
		for(char c: arr)
		{
			if(set.add(c))
				{
					sb.append(c);
				}
		}
		
//		just to reduce this loop we used above for each loop		
//		for(Character a:set)
//		{
//			sb.append(a);
//		}
		System.out.println(sb.toString());
	}
}
