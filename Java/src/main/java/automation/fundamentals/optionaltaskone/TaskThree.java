// Ввести n чисел с консоли. Вывести на консоль те числа, длина которых меньше (больше)
// средней длины по всем числам, а также длину.
package automation.fundamentals.optionaltaskone;

import java.util.Scanner;

public class TaskThree {
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

                double totalLengthOfNumbers = 0;
                for (int i = 0; i < array.length; i++) {
                    totalLengthOfNumbers += String.valueOf(array[i]).length();
                }
                double averageLengthOfNumbers = totalLengthOfNumbers / array.length;
                System.out.printf("Average length of numbers is %.2f.\n", averageLengthOfNumbers);

                System.out.print("\nHere are numbers which length is greater "
                                  + "than average length of numbers:\t");
                for (int i = 0; i < array.length; i++) {
                    if (String.valueOf(array[i]).length() > averageLengthOfNumbers) {
                        System.out.print(array[i] + " ");
                    }
                }

                System.out.print("\nHere are numbers which length is less "
                                  + "than average length of numbers:\t");
                for (int i = 0; i < array.length; i++) {
                    if (String.valueOf(array[i]).length() < averageLengthOfNumbers) {
                        System.out.print(array[i] + " ");
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