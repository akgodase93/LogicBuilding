package logical;

import java.util.HashMap;

public class StringCharFrequency {

	public static void main(String[] args) {
		
		String str="madam";
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		
		char[] charArray=str.toLowerCase().toCharArray();
		for(char character: charArray)
		{
			map.put(character, map.getOrDefault(character, 0)+1);
		}
		
		for(char key:map.keySet())
		{
			System.out.println(key+":"+map.get(key));
		}
	}
}
