// Main task: 1. Student. Создать массив объектов и вывести:
// a) список студентов заданного факультета;
// b) списки студентов для каждого факультета и курса;
// c) список студентов, родившихся после заданного года;
// d) список учебной группы.
package automation.classes.consoleapplicationversion;

import automation.classes.consoleapplicationversion.exceptions.IllegalPhoneNumberFormatException;
import automation.classes.consoleapplicationversion.exceptions.IncorrectFullNameException;
import java.util.GregorianCalendar;

public class UniversityRunner {
    public static void main(String[] args) {
        ListCreator totalListOfStudents = new ListCreator();

        try {
            totalListOfStudents.addNewStudentToList(new Student(125468, "Ivanov Sergey Sergeevich",
                    new GregorianCalendar(1999, 0, 12),
                    new Student.Contacts("ul. Kurchatova, bld. 2", "+37544 2256545"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.FOURTH, 225));
            totalListOfStudents.addNewStudentToList(new Student(212556, "Lappo Christina Yurievna",
                    new GregorianCalendar(2001, 7, 23),
                    new Student.Contacts("ul. Orlovskaya, bld. 43", "+37544 7539565"),
                    Faculty.FACULTY_OF_LAW, YearOfStudy.SECOND, 105));
            totalListOfStudents.addNewStudentToList(new Student(153122, "Rachkov Ivan Vladimirovich",
                    new GregorianCalendar(2000, 11, 2),
                    new Student.Contacts("ul. Kulman, bld. 3", "+37525 6548532"),
                    Faculty.FACULTY_OF_LAW, YearOfStudy.SECOND, 105));
            totalListOfStudents.addNewStudentToList(new Student(175896, "Odintsov Yury Stepanovich",
                    new GregorianCalendar(1999, 0, 8),
                    new Student.Contacts("ul. Narodnaya, bld. 23", "+37525 8946532"),
                    Faculty.FACULTY_OF_LAW, YearOfStudy.SECOND, 105));
            totalListOfStudents.addNewStudentToList(new Student(365897, "Rahmaninova Yana Egorovna",
                    new GregorianCalendar(1998, 10, 8),
                    new Student.Contacts("ul. Malinina, bld. 12", "+37529 7445512"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.FOURTH, 225));
            totalListOfStudents.addNewStudentToList(new Student(542136, "Volkova Anna Sergeevna",
                    new GregorianCalendar(1997, 9, 17),
                    new Student.Contacts("ul.Surganova, bld.122", "+37544 8056441"),
                    Faculty.FACULTY_OF_ECONOMICS, YearOfStudy.FIFTH, 333));
            totalListOfStudents.addNewStudentToList(new Student(226543, "Larin Oleg Alexandrovich",
                    new GregorianCalendar(1996, 1, 4),
                    new Student.Contacts("Dzerzhinskogo av., bld. 155", "+37544 7748596"),
                    Faculty.FACULTY_OF_ECONOMICS, YearOfStudy.FIFTH, 333));
            totalListOfStudents.addNewStudentToList(new Student(562345, "Chaikovsky Yan Ivanovich",
                    new GregorianCalendar(1997, 2, 10),
                    new Student.Contacts("ul. Starovilenskaya, bld. 95", "+37544 6699442"),
                    Faculty.FACULTY_OF_ECONOMICS, YearOfStudy.FIFTH, 333));
            totalListOfStudents.addNewStudentToList(new Student(425132, "Zakrevsky Yury Sergeevich",
                    new GregorianCalendar(1999, 5, 16),
                    new Student.Contacts("ul. Bogdanovicha, bld. 133", "+37544 6174542"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.FOURTH, 225));
            totalListOfStudents.addNewStudentToList(new Student(322562, "Smolskiy Dmitry Ivanovich",
                    new GregorianCalendar(2000, 7, 23),
                    new Student.Contacts("ul. Korolya, bld. 12", "+37529 6121317"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.THIRD, 117));
            totalListOfStudents.addNewStudentToList(new Student(322497, "Savitsky Ignat Andreevich",
                    new GregorianCalendar(2000, 9, 14),
                    new Student.Contacts("ul. Molodyozhnaya, bld. 9", "+37529 6231723"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.THIRD, 117));
        }
        catch (IncorrectFullNameException | IllegalPhoneNumberFormatException ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println("Hello! Welcome to our university!");
        Menu menu = new Menu();
        menu.showMainMenu();
        menu.goToChosenAction();
    }
}