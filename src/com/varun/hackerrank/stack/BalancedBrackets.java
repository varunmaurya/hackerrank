package com.varun.hackerrank.stack;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "([[)";
        System.out.println(isBalanced(s));
    }
    public static String isBalanced(String s) {
        // Write your code here
        char[] bracketArr = s.toCharArray();
        Stack<Character> stack =  new Stack();
        for (char c : bracketArr){
            if(c =='{' || c == '[' || c=='('){
                stack.push(c);
            }
            if(c =='}' || c == ']' || c==')'){
                char popped;
                try {
                     popped = stack.pop();
                }catch (Exception e){
                    return "NO";
                }
                if((c=='}'&& popped == '{') || (c==']'&& popped == '[') || (c==')'&& popped == '(') ){
                    continue;
                }else{
                    return "NO";
                }
            }
        }
        if(stack.size() >0){
            return "NO";
        }
        return "YES";
    }
}
