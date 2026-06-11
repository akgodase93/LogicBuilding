package logical;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StringWordFrequency {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String input=sc.nextLine();
		
		LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
		
		String[] arr=input.trim().split(" ");
		
		for(String a: arr)
		{
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		System.out.println(map);
	}
}
