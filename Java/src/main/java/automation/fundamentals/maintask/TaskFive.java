// Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.
package automation.fundamentals.maintask;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Just input a number from 1 to 12 in order to choose a corresponding month!"
                         + "\nYour choice:\t");
        if (scanner.hasNextInt()) {
            int chosenNumberOfMonth = scanner.nextInt();

            switch (chosenNumberOfMonth) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("Jule");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Chosen number is outside the specified range of values.");
            }
        } else {
            System.out.println("You haven't inputted a number from 1 to 12 "
                               + "in order to choose a month.");
        }
    }
}