
import java.util.Scanner;

public class TestPostfixEvaluator {
	static String ex;
    public static void main(String[] args) {

        PostFixEvaluator evaluator = new PostFixEvaluator();

        String line;
      // Scanner in = new Scanner(System.in);
       //String e=in.nextLine();
       try {
    	ex="*8 + 2 10";
    	int c=ex.length()-1;
    	
    		System.out.println(evaluator.prepost(ex));
    	
	   } catch (PostFixEvaluator.SyntaxErrorException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	  }
        /*do {

                try {
                    int result = evaluator.eval(ex);
                    System.out.println("Value is " + result);
                } catch (PostFixEvaluator.SyntaxErrorException ex) {
                    System.out.println("Syntax error " + ex.getMessage());
                }
           
        } while (true);
    }*/
    }
}

