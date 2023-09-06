interface Message {
    String message(String name);
}

public class LambdaExpressionBodyTest {
    public static void main(String args[]) {

        // Lambda expression using single expression
        Message msg1 = msg -> "TutorialsPoint " + msg;
        System.out.println(msg1.message("Lambda Expression With Expression"));



        // Lambda expression using statement
        Message msg2 = msg -> {
            return "TutorialsPoint " + msg;
        };

        System.out.println(msg2.message("Lambda Expression With Statement"));

        

        // Lambda expression using multiple statements
        Message msg3 = msg -> {
            String hello = "TutorialsPoint " + msg;
            return hello;
        };

        System.out.println(msg3.message("Lambda Expression With Multiple Statement"));
    }
}