// Приветствовать любого пользователя при вводе его имени (*в консоль).
package automation.fundamentals.maintask;

import java.util.Scanner;

public class TaskOneConsoleVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Just input your name!");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
        scanner.close();
    }
}