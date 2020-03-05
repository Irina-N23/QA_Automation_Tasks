package automation.classes.versionforclientcodeuse.comparators;

import automation.classes.versionforclientcodeuse.Student;
import java.util.Comparator;

public class StudentGroupNumberComparator implements Comparator<Student> {
    public int compare(Student thisStudent, Student thatStudent) {
        return thisStudent.getGroupNumber() - thatStudent.getGroupNumber();
    }
}