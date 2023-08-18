// Extra task https://leetcode.com/problems/valid-parentheses/

package ru.yandex.tasks;

import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<sequence.length(); i++){
            char now = sequence.charAt(i);
            if (now == '{' || now == '(' || now == '['){
                stack.push(now);
                continue;
            }
            char last = stack.pop();
            if (last == '{' && now == '}'){
                continue;
            }
            if (last == '(' && now == ')'){
                continue;
            }if (last == '[' && now == ']'){
                continue;
            }
            return false;
        }

        return stack.size() == 0;
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
