
import java.util.Scanner;
import java.util.Stack;
//POSTFIXCONVERTER IN OBJESÝNÝ OLUÞTURDUM AYNI PAKETE KOYUP ÇALIÞTIRMAYI UNUTMAYIN.

public class ConvertToPost {

	static boolean isOperator(String x) {
		switch (x) {
		case "+":
		case "-":
		case "/":
		case "*":
			return true;
		}
		return false;
	}

	private static String preToPost(String e) {

		// e = e.replaceAll("\\s+", "");

		
		Stack<String> ourStack = new Stack<>();
		
         String[] c = e.split(" ");
         for(int i=0;i<c.length;i++) System.out.println(c[i]);
         
			System.out.println("length: " + c.length);
			
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.println("i: " + i);
			if (isOperator(c[i])) {
				// System.out.println(c[i]);

				String op1 = ourStack.pop();
				String op2 = ourStack.pop();
				String exp = op1 + " " + op2 + " " + c[i];

				ourStack.push(exp);
			} else {
				// System.out.println(c[i]);

				ourStack.push(c[i]);
			}
		}
		return ourStack.peek();

	}

	public static void main(String... strings) {

		Scanner s = new Scanner(System.in);
		String input = s.nextLine();

		PostFixEvaluator postFixEvaluator = new PostFixEvaluator();
		try {
			System.out.println("Result: " + postFixEvaluator.eval(preToPost(input)));
		} catch (PostFixEvaluator.SyntaxErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
