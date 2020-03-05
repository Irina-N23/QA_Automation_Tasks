// Ввести n чисел с консоли.
// Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
package automation.fundamentals.optionaltaskone;

import java.util.Scanner;

public class TaskOneConsoleVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to input? "
                           + "Just input their quantity and press <ENTER> then!");
        if (scanner.hasNextInt()) {
            int[] array = new int[scanner.nextInt()];

            System.out.print("Just input your numbers in here:\t");
            if (scanner.hasNextInt()) {
                int longestNumberLength = 1;
                int shortestNumberLength = Integer.MAX_VALUE;
                int longestNumber = 0;
                int shortestNumber = Integer.MAX_VALUE;

                System.out.print("Here are your numbers according to their " +
                                 "previously chosen quantity:\t");
                for (int element : array) {
                    element = scanner.nextInt();
                    System.out.print(element + " ");

                    if ((String.valueOf(element).length() >= longestNumberLength)
                            && (element > longestNumber)) {
                        longestNumberLength = String.valueOf(element).length();
                        longestNumber = element;
                    }
                    if ((String.valueOf(element).length() <= shortestNumberLength)
                            && (element < shortestNumber)) {
                        shortestNumberLength = String.valueOf(element).length();
                        shortestNumber = element;
                    }
                }
                System.out.printf("\n\nThe shortest and the least value is %d. ", shortestNumber);
                System.out.println("It consists of " + shortestNumberLength  + " digit(s).");
                System.out.printf("The longest and the greatest value is %d. ", longestNumber);
                System.out.println("It consists of " + longestNumberLength + " digit(s).");
            } else {
            System.out.println("Numbers have not been inputted.");
            }
        } else {
            System.out.println("Amount of numbers has not been chosen.");
        }
        scanner.close();
    }
}