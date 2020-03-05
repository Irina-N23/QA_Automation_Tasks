package automation.classes.consoleapplicationversion;

import automation.classes.consoleapplicationversion.comparators.StudentFacultyComparator;
import automation.classes.consoleapplicationversion.comparators.StudentGroupNumberComparator;
import java.util.*;

class ListCreator {
    private static List<Student> listOfStudents = new ArrayList<>();

    void addNewStudentToList(Student newStudent) {
        listOfStudents.add(newStudent);
    }

    ArrayList<Integer> getListOfGroups() {
        ArrayList<Integer> listOfGroups = new ArrayList<>();
        Iterator<Student> iterator = listOfStudents.iterator();
        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();
            if (!listOfGroups.contains(currentStudent.getGroupNumber())) {
                listOfGroups.add(currentStudent.getGroupNumber());
            }
        } return listOfGroups;
    }

    ArrayList<String> getListOfFaculties() {
        ArrayList<String> listOfFaculties = new ArrayList<>();
        for (Faculty faculty : Faculty.values()) {
            listOfFaculties.add("Faculty of " + faculty.getFacultyName());
        } return listOfFaculties;
    }

    List<Student> findStudentsOfChosenFaculty() {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentListForChosenFaculty = new ArrayList<>();

        System.out.print("\nJust input the abbreviation of selected faculty "
                           + "and press <ENTER> then!\nYour choice:\t");
        String chosenFaculty = scanner.nextLine();

        Iterator<Student> iterator = listOfStudents.iterator();
        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();
            if ((!chosenFaculty.isEmpty())
                    && currentStudent.getFaculty().getFacultyName().contains(chosenFaculty)) {
                studentListForChosenFaculty.add(currentStudent);
            }
        }
        return studentListForChosenFaculty;
    }

    List<Student> sortStudentsByFacultyAndYearOfStudy() {
        Comparator<Student> comparator = new StudentFacultyComparator()
                .thenComparing(new StudentGroupNumberComparator());
        listOfStudents.sort(comparator);
        return listOfStudents;
    }

    List<Student> findStudentsBornAfterSelectedYear() {
        Scanner scanner = new Scanner(System.in);
        List<Student> listOfStudentBornAfterSelectedYear = new ArrayList<>();

        if (scanner.hasNextInt()) {
            int selectedYear = scanner.nextInt();
            Iterator<Student> iterator = listOfStudents.iterator();
            while (iterator.hasNext()) {
                Student currentStudent = iterator.next();
                if (currentStudent.getBirthDate().get(Calendar.YEAR) > selectedYear) {
                    listOfStudentBornAfterSelectedYear.add(currentStudent);
                }
            }
        } else {
            System.out.print("You have inputted incorrect data.");
        }
        return listOfStudentBornAfterSelectedYear;
    }

    List<Student> findStudentsOfChosenGroup() {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentListForSelectedGroupNumber = new ArrayList<>();

        if (scanner.hasNextInt()) {
            int selectedGroupNumber = scanner.nextInt();
            Iterator<Student> iterator = listOfStudents.iterator();
            while (iterator.hasNext()) {
                Student currentStudent = iterator.next();
                if (currentStudent.getGroupNumber() == selectedGroupNumber) {
                    studentListForSelectedGroupNumber.add(currentStudent);
                }
            }
        } else {
            System.out.print("You have inputted incorrect data.");
        }
        return studentListForSelectedGroupNumber;
    }
}