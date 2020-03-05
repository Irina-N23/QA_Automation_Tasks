package automation.collections.maintask;

import java.util.Scanner;

class Menu {
    void showMainMenu() {
        System.out.println("Welcome to main menu!");
        System.out.println("Just choose a number of necessary action and press <ENTER> then:");
        System.out.println("\t1. Display a total list of tracks;");
        System.out.println("\t2. Display total length of tracks;");
        System.out.println("\t3. Display a list of tracks sorted by music styles;");
        System.out.println("\t4. Display a list of tracks of chosen length range;");
        System.out.println("\t5. Quit.");
        System.out.print("Your choice:\t");
    }

    private Scanner chosenAction = new Scanner(System.in);
    private PlaylistCreator playlistCreator = new PlaylistCreator();

    void goToChosenAction() {
        switch (chosenAction.nextLine()) {
            case "1":
                System.out.println("\nHere is a total list of tracks:");
                playlistCreator.printFullTracklist();
                goBackOrExit();
                break;
            case "2":
                System.out.println("\nTotal length of tracks: \t"
                                   + playlistCreator.sumTotalLengthOfTracks() + " minutes.");
                goBackOrExit();
                break;
            case "3":
                System.out.print("\nHere are all tracks sorted by their music styles:\t");
                System.out.println(playlistCreator.sortTracksByStyle());
                goBackOrExit();
                break;
            case "4":
                System.out.println(playlistCreator.findTracksOfChosenLengthRange());
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

    void goBackOrExit() {
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
                System.out.println("\nYou have inputted incorrect data. Just try again!");
                goBackOrExit();
        }
    }
}