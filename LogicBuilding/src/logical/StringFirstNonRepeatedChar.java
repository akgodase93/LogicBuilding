package logical;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 * 
	Input  : "automation"
	Output : u
 *
 */
public class StringFirstNonRepeatedChar {
	public static void main(String[] args) {
		
		String input="automation";
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		char []arr=input.toCharArray();
		
		for(char a: arr)
		{
			map.put(a, map.getOrDefault(a, 0)+1);
		} 
		
		for(Entry<Character, Integer> c: map.entrySet())
		{
			if(c.getValue() ==1)
			{
				System.out.println("First non repeated character in string is: "+c.getKey());
				break;
			}
		}
	}

}
