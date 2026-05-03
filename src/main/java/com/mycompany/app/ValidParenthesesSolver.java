package com.mycompany.app;

import java.util.Stack;

public class ValidParenthesesSolver implements Solver {
    @Override
    public String solve() {
        String testStr = "{[]}";
        boolean isValid = isValid(testStr);
        System.out.println("字符串 \"" + testStr + "\" 是否合法: " + isValid);
        return "有效括号问题已解决！";
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            // 如果栈为空，或者弹出的括号不匹配，返回 false
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}