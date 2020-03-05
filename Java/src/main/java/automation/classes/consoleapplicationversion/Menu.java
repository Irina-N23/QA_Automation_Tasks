package automation.classes.consoleapplicationversion;

import java.util.Scanner;

class Menu {
    void showMainMenu() {
        System.out.println("What action do you want to choose?");
        System.out.println("Just input the number of your action and press <ENTER> then!");
        System.out.println("\t1. Display list of students for selected faculty.");
        System.out.println("\t2. Display lists of students for every faculty and year of study.");
        System.out.println("\t3. Display list of students born after selected year.");
        System.out.println("\t4. Display list of students for selected group.");
        System.out.println("\t5. Quit.");
        System.out.print("Choose one:\t");
    }

    private ListCreator listCreator = new ListCreator();
    private Scanner chosenAction = new Scanner(System.in);

    void goToChosenAction() {
        switch (chosenAction.nextLine()) {
            case "1":
                System.out.println("\nHere is a list of faculties in our university:\n"
                                   + listCreator.getListOfFaculties());
                System.out.println(listCreator.findStudentsOfChosenFaculty());
                goBackOrExit();
                break;
            case "2":
                System.out.println("Here is a total list of students grouped "
                                   + "by their faculty and year of study:");
                System.out.println(listCreator.sortStudentsByFacultyAndYearOfStudy());
                goBackOrExit();
                break;
            case "3":
                System.out.print("\nJust input necessary birth year "
                                 + "(within the range of 1996 to 2001):\t");
                System.out.println(listCreator.findStudentsBornAfterSelectedYear());
                goBackOrExit();
                break;
            case "4":
                System.out.println("\nHere are numbers of all groups in our university:\t"
                                   + listCreator.getListOfGroups());
                System.out.print("Just choose necessary group number:\t");
                System.out.println(listCreator.findStudentsOfChosenGroup());
                goBackOrExit();
                break;
            case "5":
                completeThisProgram();
            default:
                System.out.println("\nYou have inputted incorrect data. Just try again!");
                System.out.print("Your choice:\t");
                goToChosenAction();
        }
        System.out.println();
    }

    private void completeThisProgram() {
        System.out.print("\nCompleting the program...");
        chosenAction.close();
        System.exit(0);
    }

    private void goBackOrExit() {
        System.out.println("\nWhat's your next action?");
        System.out.println("\t1. Go back to main menu for choosing another action;");
        System.out.println("\t2. Quit.");
        System.out.print("Just input the number of your action and press <ENTER> then:\t");

        switch (chosenAction.nextLine()) {
            case "1":
                System.out.println();
                showMainMenu();
                goToChosenAction();
                break;
            case "2":
                completeThisProgram();
            default:
                System.out.println("You have inputted incorrect data. Just try again!");
                goBackOrExit();
        }
    }
}