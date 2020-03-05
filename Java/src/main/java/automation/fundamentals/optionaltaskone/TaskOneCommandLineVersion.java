// Ввести n чисел (*в командной строке):
// Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
package automation.fundamentals.optionaltaskone;

public class TaskOneCommandLineVersion {
    public static void main(String[] args) {
        int longestArgLength = 1;
        int shortestArgLength = Integer.MAX_VALUE;
        int longestArg = 0;
        int shortestArg = Integer.MAX_VALUE;

        if (args.length > 0) {
            System.out.print("Inputted arguments \"args\" are: ");
            for (String arg : args) {
                System.out.print(arg + " ");
                if ((arg.length() >= longestArgLength) && (Integer.parseInt(arg) > longestArg)) {
                    longestArgLength = arg.length();
                    longestArg = Integer.parseInt(arg);
                }
                if ((arg.length() <= shortestArgLength) && (Integer.parseInt(arg) < shortestArg)) {
                    shortestArgLength = arg.length();
                    shortestArg = Integer.parseInt(arg);
                }
            }
            System.out.printf("\n\nThe longest and the greatest value is %d.\n", longestArg);
            System.out.println("It consists of " + longestArgLength + " digit(s).");
            System.out.printf("\nThe shortest and the least value is %d.\n", shortestArg);
            System.out.println("It consists of " + shortestArgLength  + " digit(s).");
        } else {
            System.out.println("Arguments \"args\" have not been found.");
        }
    }
}