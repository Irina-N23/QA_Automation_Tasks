// Задан файл с текстом на английском языке. Выделить все различные слова.
// Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.
package automation.collections.optionaltasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TaskEight {
    public static void main(String[] args) {
        HashSet<String> poem = new HashSet<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileReader("src" + File.separator + "main" + File.separator
                                                 + "java" + File.separator + "automation"
                                                 + File.separator + "collections"
                                                 + File.separator + "optionaltasks"
                                                 + File.separator +"For Reading.txt"));
            scanner.useDelimiter("[^A-z]+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                poem.add(word.toLowerCase());
            }
        } catch (FileNotFoundException exception) {
            System.err.println("File has not been found!\n[" + exception + "]");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        System.out.println("Using HashSet:\n" + poem);

        TreeSet<String> sortedWords = new TreeSet<>(poem);
        System.out.println("\nUsing TreeSet:\n" + sortedWords);
    }
}