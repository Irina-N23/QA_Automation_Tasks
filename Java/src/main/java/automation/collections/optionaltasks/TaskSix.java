// Ввести строки из файла, записать в список ArrayList.
// Выполнить сортировку строк, используя метод sort() из класса Collections.
package automation.collections.optionaltasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        ArrayList<String> poem = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileReader("src" + File.separator + "main" + File.separator
                                                 + "java" + File.separator + "automation"
                                                 + File.separator + "collections" + File.separator
                                                 + "optionaltasks" + File.separator
                                                 + "For Reading.txt"));
            while (scanner.hasNextLine()) {
                poem.add("\n" + scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            System.err.println("File has not been found!\n[" + exception + "]");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String thisLine, String thatLine) {
                return thisLine.length() - thatLine.length();
            }
        };
        Collections.sort(poem, comparator);
        System.out.println(poem);
    }
}