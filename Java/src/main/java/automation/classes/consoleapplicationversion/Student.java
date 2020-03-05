package automation.classes.consoleapplicationversion;

import automation.classes.consoleapplicationversion.exceptions.IllegalPhoneNumberFormatException;
import automation.classes.consoleapplicationversion.exceptions.IncorrectFullNameException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private int studentId;
    private String fullName;
    private GregorianCalendar birthDate;
    private Contacts contacts;
    private Faculty faculty;
    private YearOfStudy yearOfStudy;
    private int groupNumber;

    Student() {
    }

    Student(String fullName, Faculty faculty, YearOfStudy yearOfStudy, int groupNumber)
            throws IncorrectFullNameException {
        setFullName(fullName);
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
        this.groupNumber = groupNumber;
    }

    Student(int studentId, String fullName, GregorianCalendar birthDate, Contacts contacts,
            Faculty facultyName, YearOfStudy year, int groupNumber)
            throws IncorrectFullNameException {
        this.studentId = studentId;
        setFullName(fullName);
        this.birthDate = birthDate;
        this.contacts = contacts;
        this.faculty = facultyName;
        this.yearOfStudy = year;
        this.groupNumber = groupNumber;
    }

    int getStudentId() {
        return studentId;
    }

    void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    String getFullName() {
        return fullName;
    }

    void setFullName(String fullName) throws IncorrectFullNameException {
        if (fullName == null || fullName.isEmpty()) {
            throw new IncorrectFullNameException("Incorrect full name of student: null or empty.");
        }
        this.fullName = fullName;
    }

    GregorianCalendar getBirthDate() {
        return birthDate;
    }

    void setBirthDate(GregorianCalendar birthDate) {
        this.birthDate = birthDate;
    }


    static class Contacts {
        private String address;
        private String phoneNumber;

        Contacts(String address, String phoneNumber) throws IllegalPhoneNumberFormatException {
            setAddress(address);
            setPhoneNumber(phoneNumber);
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        String getAddress() {
            return address;
        }

        void setAddress(String address) throws IllegalArgumentException {
            if (address == null || address.isEmpty()) {
                throw new IllegalArgumentException("Incorrect address of student: null or empty.");
            }
            this.address = address;
        }

        String getPhoneNumber() {
                return phoneNumber;
        }

        void setPhoneNumber(String phoneNumber) throws IllegalPhoneNumberFormatException {
            Pattern pattern = Pattern.compile("^(\\+375)(\\d{2})(\\s)(\\d{7})$");
            Matcher matcher = pattern.matcher(phoneNumber);
            if (!matcher.matches() || phoneNumber == null || phoneNumber.isEmpty()) {
                throw new IllegalPhoneNumberFormatException("Phone number has to be inputted"
                                                            + " in format +375XX XXXXXXX.");
            }
            this.phoneNumber = phoneNumber;
        }
    }


    Contacts getContacts() {
        return contacts;
    }

    void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    YearOfStudy getYearOfStudy() {
        return yearOfStudy;
    }

    void setYearOfStudy(YearOfStudy yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "\n\t{Student - " + fullName + ": \nid № " + studentId
                    + ", faculty of " + faculty.getFacultyName()
                    + ", year of study: " + yearOfStudy +
                    ", group № " + groupNumber
                    + ". Year of birth: " + getBirthDate().get(Calendar.YEAR) + "}";
    }
}