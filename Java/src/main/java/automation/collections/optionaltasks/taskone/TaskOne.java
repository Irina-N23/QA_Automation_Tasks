// Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
package automation.collections.optionaltasks.taskone;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(new FileReader("src/main/java/automation/collections/"
                                                 + "optionaltasks/For Reading.txt"));
            while (scanner.hasNextLine()) {
                stringList.add("\n" + scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            System.err.println("File was not found!\n[" + exception + "]");
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }

        Collections.reverse(stringList);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(new File("src/main/java/automation/collections/"
                                        + "optionaltasks/taskone/Written.txt"));
            fileWriter.write(stringList.toString());
        } catch (IOException exception) {
            System.err.println("File writing has been failed.");
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException exception) {
                System.err.println("Error of stream closing" + exception);
            }
        }
    }
}