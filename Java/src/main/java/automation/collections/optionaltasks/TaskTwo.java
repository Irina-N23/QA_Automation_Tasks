// Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
package automation.collections.optionaltasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Just input a positive integer!");
        String input = scanner.nextLine();
        if (input.matches("^(\\d+)$")) {
            char[] array = input.toCharArray();
            Deque<Character> stack = new ArrayDeque<>();
            for (char element : array) {
                stack.push(element);
            }

            StringBuilder reversedInteger = new StringBuilder();
            while (!stack.isEmpty()) {
                reversedInteger.append(stack.pop());
            }
            System.out.println("In the reverse sequence:\t"
                               + Integer.parseInt(reversedInteger.toString()));
        } else {
            System.out.print("INVALID DATA:\tNo positive integer found!");
        }
    }
}