package logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringDuplicateChars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String:");
		String input = sc.next();

		HashMap<Character, Integer> map = new HashMap<>();

		char[] arr = input.toCharArray();
		for (char a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2) {
				System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
			}
		}
		sc.close();
	}

}
