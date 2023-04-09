package Seminar5;

import java.util.*;

public class Homework {

    public static void main(String[] args) {

        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true

    }
    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        // Нужно использовать Deque.
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся
        Map<Character, Character> map = new HashMap<>();
        Deque<Character> deque = new ArrayDeque<>();
        char[] charArray = parentheses.toCharArray();

        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        map.put('(', ')');

        for (char charArr : charArray) {

            try {

                if (map.get(charArr) != null) {
                    deque.addFirst(charArr);
                } else if (charArr == map.get(deque.getFirst())) {
                    deque.pollFirst();
                }

            } catch (NoSuchElementException | NullPointerException e) {

                return false;
            }
        }

        return deque.isEmpty();
    }
}

