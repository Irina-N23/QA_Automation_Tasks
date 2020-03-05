// Создать список из элементов каталога и его подкаталогов.
package automation.collections.optionaltasks.taskthree;

import java.io.File;
import java.util.ArrayList;

public class TaskThree {
    public static void main(String[] args) {
        ListOfFilesCreator listCreator = new ListOfFilesCreator();

        File mainTask = new File("src" + File.separator + "main" + File.separator + "java"
                                 + File.separator + "automation" + File.separator + "collections"
                                 + File.separator + "maintask");
        System.out.println(listCreator.createListWithElementsOfDirectory(mainTask,
                                                                         new ArrayList<>()));

        File classes = new File("src" + File.separator + "main" + File.separator + "java"
                                + File.separator +"automation" + File.separator + "classes");
        System.out.println("\n" + listCreator.createListWithElementsOfDirectory(classes,
                                                                         new ArrayList<>()));
    }
}