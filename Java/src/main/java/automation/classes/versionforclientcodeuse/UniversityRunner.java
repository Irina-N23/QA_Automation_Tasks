package automation.classes.versionforclientcodeuse;

import automation.classes.versionforclientcodeuse.exceptions.IllegalPhoneNumberFormatException;
import automation.classes.versionforclientcodeuse.exceptions.IncorrectFullNameException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class UniversityRunner {
    public static void main(String[] args) {
        List<Student> totalListOfStudents = new ArrayList<>();

        try {
            totalListOfStudents.add(new Student(125468, "Ivanov Sergey Sergeevich",
                    new GregorianCalendar(1999, Calendar.JANUARY, 12),
                    new Student.Contacts("ul. Kurchatova, bld. 2", "+37544 2256545"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.FOURTH, 225));
            totalListOfStudents.add(new Student(212556, "Metelskaya Christina Valerievna",
                    new GregorianCalendar(2001, Calendar.AUGUST, 23),
                    new Student.Contacts("ul. Orlovskaya, bld. 43", "+37544 7539565"),
                    Faculty.FACULTY_OF_LAW, YearOfStudy.SECOND, 105));
            totalListOfStudents.add(new Student(153122, "Ikon Denis Vladimirovich",
                    new GregorianCalendar(2000, Calendar.DECEMBER, 2),
                    new Student.Contacts("ul. Kulman, bld. 3", "+37525 6548532"),
                    Faculty.FACULTY_OF_LAW, YearOfStudy.SECOND, 105));
            totalListOfStudents.add(new Student(175896, "Odintsov Yury Vladimirovich",
                    new GregorianCalendar(1999, Calendar.JANUARY, 8),
                    new Student.Contacts("ul. Narodnaya, bld. 23", "+37525 8946532"),
                    Faculty.FACULTY_OF_LAW, YearOfStudy.SECOND, 105));
            totalListOfStudents.add(new Student(365897, "Kostenko Darya Vitalievna",
                    new GregorianCalendar(1998, Calendar.NOVEMBER, 8),
                    new Student.Contacts("ul. Malinina, bld. 12", "+37529 7445512"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.FOURTH, 225));
            totalListOfStudents.add(new Student(542136, "Kapuza Maria Sergeevna",
                    new GregorianCalendar(1997, Calendar.OCTOBER, 17),
                    new Student.Contacts("ul.Surganova, bld.122", "+37544 8056441"),
                    Faculty.FACULTY_OF_ECONOMICS, YearOfStudy.FIFTH, 333));
            totalListOfStudents.add(new Student(226543, "Larin Andrey Alexandrovich",
                    new GregorianCalendar(1996, Calendar.FEBRUARY, 4),
                    new Student.Contacts("Dzerzhinskogo av., bld. 155", "+37544 7748596"),
                    Faculty.FACULTY_OF_ECONOMICS, YearOfStudy.FIFTH, 333));
            totalListOfStudents.add(new Student(562345, "Faley Alexey Petrovich",
                    new GregorianCalendar(1997, Calendar.MARCH, 10),
                    new Student.Contacts("ul. Starovilenskaya, bld. 95", "+37544 6699442"),
                    Faculty.FACULTY_OF_ECONOMICS, YearOfStudy.FIFTH, 333));
            totalListOfStudents.add(new Student(425132, "Zakrevskiy Gennady Viktorovich",
                    new GregorianCalendar(1999, Calendar.JUNE, 16),
                    new Student.Contacts("ul. Bogdanovicha, bld. 133", "+37544 6174542"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.FOURTH, 225));
            totalListOfStudents.add(new Student(322562, "Ambrazhey Dmitry Ivanovich",
                    new GregorianCalendar(2000, Calendar.AUGUST, 23),
                    new Student.Contacts("ul. Korolya, bld. 12", "+37529 6121317"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.THIRD, 117));
            totalListOfStudents.add(new Student(322497, "Abramovich Ignat Andreevich",
                    new GregorianCalendar(2000, Calendar.OCTOBER, 14),
                    new Student.Contacts("ul. Molodyozhnaya, bld. 9", "+37529 6231723"),
                    Faculty.FACULTY_OF_PHYSICS, YearOfStudy.THIRD, 117));
        }
        catch (IllegalPhoneNumberFormatException | IncorrectFullNameException exception) {
            System.err.println(exception.getMessage());
        }

        System.out.println("TOTAL LIST OF STUDENTS:\n" + totalListOfStudents);

        ListCreator listOfStudents = new ListCreator();

        System.out.println("\nLIST OF STUDENTS GROUPED BY FACULTY:");
        System.out.println(listOfStudents.findStudentsOfSelectedFaculty(Faculty.FACULTY_OF_LAW,
                                                                        totalListOfStudents));

        System.out.println("\nLIST OF STUDENTS GROUPED BY FACULTY AND YEAR OF STUDY:");
        System.out.println(listOfStudents.sortStudentsByFacultyAndYearOfStudy(totalListOfStudents));

        System.out.println("\nLIST OF STUDENTS BORN AFTER SELECTED YEAR:");
        System.out.println(listOfStudents.findStudentsBornAfterSelectedYear(1998,
                                                                            totalListOfStudents));

        System.out.println("\nLIST OF STUDENTS OF SELECTED GROUP NUMBER:");
        System.out.println(listOfStudents.findStudentsOfSelectedGroup(333, totalListOfStudents));
    }
}