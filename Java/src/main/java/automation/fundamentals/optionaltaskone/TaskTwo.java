// Ввести n чисел с консоли.
// Вывести числа в порядке возрастания (убывания) значений их длины.
package automation.fundamentals.optionaltaskone;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to input? "
                           + "Just input their quantity and press <ENTER> then!");
        if (scanner.hasNextInt()) {
            int[] array = new int[scanner.nextInt()];

            System.out.print("Just input your numbers in here:\t");
            if (scanner.hasNextInt()) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = scanner.nextInt();
                }

                System.out.println("Just input a number of your next action:");
                System.out.println("\t1. Display numbers sorted by their length "
                                   + "in descending order;");
                System.out.println("\t2. Display numbers sorted by their length "
                                   + "in ascending order.");
                System.out.print("Your choice:\t");

                boolean needIteration = true;
                int permutationValue;
                switch (scanner.next()) {
                    case "1":
                        System.out.print("\nHere are your numbers sorted by their length "
                                         + "in descending order:\t");
                        while (needIteration) {
                            needIteration = false;
                            for (int i = 0; i < array.length - 1; i++) {
                                if (String.valueOf(array[i]).length()
                                        < String.valueOf(array[i + 1]).length()) {
                                    permutationValue = array[i];
                                    array[i] = array[i + 1];
                                    array[i + 1] = permutationValue;
                                    needIteration = true;
                                }
                            }
                        }
                        System.out.println(Arrays.toString(array));
                        break;
                    case "2":
                        System.out.print("\nHere are your numbers sorted by their length "
                                         + "in ascending order:\t");
                        while (needIteration) {
                            needIteration = false;
                            for (int i = 0; i < array.length - 1; i++) {
                                if (String.valueOf(array[i]).length()
                                        > String.valueOf(array[i + 1]).length()) {
                                    permutationValue = array[i];
                                    array[i] = array[i + 1];
                                    array[i + 1] = permutationValue;
                                    needIteration = true;
                                }
                            }
                        }
                        System.out.println(Arrays.toString(array));
                        break;
                    default:
                        System.out.println("You have inputted incorrect number of action.");
                }
            } else {
                System.out.println("Numbers have not been inputted.");
            }
        } else {
            System.out.println("Quantity of numbers has not been chosen.");
        }
        scanner.close();
    }
}