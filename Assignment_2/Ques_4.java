package com.sunbeam;
import java.util.Scanner;
import java.util.Stack;

public class Ques_4 {

    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] st = exp.trim().split("\\s+");

        for (int i=0; i<st.length; i++) {
        	String element = st[i];
            if (isNumber(element)) {
                stack.push(Integer.parseInt(element));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculate(a, b, element));
            }
        }

        return stack.pop();
    }

    public static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] st = exp.trim().split(" ");

        for (int i = st.length - 1; i >= 0; i--) {
            String token = st[i];

            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(calculate(a, b, token));
            }
        }

        return stack.pop();
    }

    public static boolean isNumber(String token) {
        return token.matches("-?\\d+");
    }

    public static int calculate(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "%":
                return a % b;
        }
		return 0;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String postfix = "25 39 + 26 -";
    int result = evaluatePostfix(postfix);
    System.out.println("Result of postfix: " + result);

    String prefix = "- + 25 39 26";
    int res = evaluatePrefix(prefix);
    System.out.println("Result of prefix: " + res);

    sc.close();
}

}
