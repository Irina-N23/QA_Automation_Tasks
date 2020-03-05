// Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
// и вывести результат на консоль.
package automation.fundamentals.maintask;

public class TaskFour {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            product *= Integer.parseInt(args[i]);
        }

        System.out.printf("The sum of arguments \"args\" is %d.\n", sum);
        System.out.printf("The product of arguments \"args\" is %d.", product);
    }
}