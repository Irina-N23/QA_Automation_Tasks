package automation.collections.optionaltasks.taskthree;

import java.io.File;
import java.util.ArrayList;

public class ListOfFilesCreator {
    ArrayList<File> createListWithElementsOfDirectory(File chosenFile,
                                                      ArrayList<File> listOfElementsOfDirectory) {
        if (!chosenFile.exists() && !chosenFile.isDirectory()) {
            System.out.println("Directory <" + chosenFile.getName() + "> doesn't exist.");
            System.exit(1);
        }
        if (chosenFile.listFiles().length > 0) {
            for (File item : chosenFile.listFiles()) {
                listOfElementsOfDirectory.add(new File(item.getName()));
                if (item.isDirectory()) {
                    createListWithElementsOfDirectory(item, listOfElementsOfDirectory);
                }
            }
        } else {
            System.out.println("Directory <" + chosenFile.getName() + "> is empty.");
        }
        return listOfElementsOfDirectory;
    }
}