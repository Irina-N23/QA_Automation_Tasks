// Отобразить в окне консоли аргументы командной строки в обратном порядке.
package automation.fundamentals.maintask;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.print("Here are arguments \"args\" in the reverse sequence:\t");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}