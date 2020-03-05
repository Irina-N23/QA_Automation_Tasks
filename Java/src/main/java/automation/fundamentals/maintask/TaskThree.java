// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
package automation.fundamentals.maintask;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random numbers have to be demonstrated? "
                           + "Just input their amount and press <ENTER> then.");
        if (scanner.hasNextInt()) {
            int amountOfRandomNumbers = scanner.nextInt();

            System.out.println("Shall each number be printed on a new line? "
                               + "Just input <yes> or <no> and press <ENTER> then.");
            String choiceOfUser = scanner.next();

            if (choiceOfUser.equalsIgnoreCase("yes")) {
                for (int i = 0; i < amountOfRandomNumbers; i++) {
                    System.out.println((int) (Math.random() * 200 - 100));
                }
            } else if (choiceOfUser.equalsIgnoreCase("no")) {
                for (int i = 0; i < amountOfRandomNumbers; i++) {
                    System.out.print((int) (Math.random() * 200 - 100) + " ");
                }
            } else {
                System.out.println("\"Yes\" or \"no\" has not been inputted!");
            }
        } else {
            System.out.println("An amount of numbers has not been inputted!");
        }
    }
}