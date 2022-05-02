package com.greatlearning.lab3;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String exp1 = "( [ [ { } ] ] ) )";
        System.out.println("Is Expression Balanced : " + isBalanceSymbolInExpression(exp1));

    }

    public static boolean isBalanceSymbolInExpression(String exprssion) {
        Stack<Character> stk = new Stack<>();
        if (exprssion == null || exprssion.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < exprssion.length(); i++) {

                if (exprssion.charAt(i) == '(' || exprssion.charAt(i) == '{' || exprssion.charAt(i) == '[') {
                    stk.push(exprssion.charAt(i));
                } else if (exprssion.charAt(i) == ')') {
                    if (!stk.isEmpty() && stk.peek() == '(') {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else if (exprssion.charAt(i) == ']') {
                    if (!stk.isEmpty() && stk.peek() == '[') {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else if (exprssion.charAt(i) == '}') {
                    if (!stk.isEmpty() && stk.peek() == '{') {
                        stk.pop();
                    } else {
                        return false;
                    }
                }
            }


            if (stk.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
