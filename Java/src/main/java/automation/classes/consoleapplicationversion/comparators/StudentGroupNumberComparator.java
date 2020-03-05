package automation.classes.consoleapplicationversion.comparators;

import automation.classes.consoleapplicationversion.Student;
import java.util.Comparator;

public class StudentGroupNumberComparator implements Comparator<Student> {
    public int compare(Student thisStudent, Student thatStudent) {
        return thisStudent.getGroupNumber() - thatStudent.getGroupNumber();
    }
}