package logical;

import java.util.Stack;

public class StringParenthesisBalancing {
	public static void main(String[] args) {

		String input = "()";

		boolean result = checkParanthesis(input);

		if (result) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not a balanced");
		}
	}

	public static boolean checkParanthesis(String input) {
		
		char[] arr=input.toCharArray();
		Stack<Character> stack=new Stack<Character>();
	
		for(char currentChar: arr)
		{
			if(currentChar == '(')
			{
				stack.push(currentChar);
			}
			else
			{
				if(currentChar == ')')
				{
					if(stack.isEmpty())
					{
						return false;
					}
					else
					{
						char topchar=stack.pop();
						if(topchar != '(')
						{
							return false;
						}
					}
				}
			}
		}
		return stack.isEmpty();
	}
}
