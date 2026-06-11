package logical;

import java.util.HashMap;

public class StringCountSpecialChars {
	public static void main(String[] args) {
		
		String input="abs#@#   ";
		char[] arr=input.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(char character: arr)
		{
			if(!((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')
					|| (character >= '0' && character <= '9') || character == ' '))
			{
				map.put(character, map.getOrDefault(character, 0)+1);
				
//				if(map.containsKey(character))
//				{
//					map.put(character, map.get(character)+1);
//				}
//				else
//				{
//					map.put(character, 1);
//				}
			}
		}
		
		System.out.println(map);
//		for(char c: map.keySet())
//		{
//			System.out.println(c+":"+map.get(c));
//		}
	}

}
