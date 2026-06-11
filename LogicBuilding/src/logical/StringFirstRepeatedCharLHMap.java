package logical;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StringFirstRepeatedCharLHMap {

	public static void main(String[] args) {

		String input = "automation";
		char arr[] = input.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (char a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 1) {
				System.out.println("First repeating character in given String is: " + entry.getKey());
				break;
			}
		}
	}
}
