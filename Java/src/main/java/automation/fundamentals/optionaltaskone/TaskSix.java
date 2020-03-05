// Ввести n чисел с консоли. Найти число, цифры в котором идут в строгом порядке возрастания.
// Если таких чисел несколько, найти первое из них.
package automation.fundamentals.optionaltaskone;

import java.util.Scanner;

public class TaskSix {
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

                for (int i = 0; i < array.length; i++) {
                    char[] charArray = String.valueOf(array[i]).toCharArray();
                    if (charArray.length > 1) {
                        boolean hasDigitsInAscendingOrder = true;
                        for (int j = 0; j < charArray.length - 1; j++) {
                            if (charArray[j] >= charArray[j + 1]) {
                                hasDigitsInAscendingOrder = false;
                            }
                        }
                        if (hasDigitsInAscendingOrder) {
                            System.out.printf("Here is the first number in array which "
                                    + "contains digits in ascending order:\t%d.", array[i]);
                            break;
                        }
                    }
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