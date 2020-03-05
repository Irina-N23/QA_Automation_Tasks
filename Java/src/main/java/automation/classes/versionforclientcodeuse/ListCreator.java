package automation.classes.versionforclientcodeuse;

import automation.classes.versionforclientcodeuse.comparators.StudentFacultyComparator;
import automation.classes.versionforclientcodeuse.comparators.StudentGroupNumberComparator;
import java.util.*;

class ListCreator {
    List<Student> findStudentsOfSelectedFaculty(Faculty selectedFaculty,
                                                List<Student> listOfStudentsForFiltration) {
        List<Student> studentListForSelectedFaculty = new ArrayList<>();
        Iterator<Student> iterator = listOfStudentsForFiltration.iterator();
        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();
            if (currentStudent.getFaculty() == selectedFaculty) {
                studentListForSelectedFaculty.add(currentStudent);
            }
        }
        return studentListForSelectedFaculty;
    }

    List<Student> sortStudentsByFacultyAndYearOfStudy(List<Student> listOfAllStudents) {
        Comparator<Student> comparator = new StudentFacultyComparator()
                .thenComparing(new StudentGroupNumberComparator());

        listOfAllStudents.sort(comparator);
        return listOfAllStudents;
    }

    List<Student> findStudentsBornAfterSelectedYear(int selectedYear,
                                                    List<Student> listOfStudentsForFiltration) {
        List<Student> listOfStudentsBornAfterSelectedYear = new ArrayList<>();
        Iterator<Student> iterator = listOfStudentsForFiltration.iterator();
        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();
            if (currentStudent.getBirthDate().get(Calendar.YEAR) > selectedYear) {
                listOfStudentsBornAfterSelectedYear.add(currentStudent);
            }
        }
        return listOfStudentsBornAfterSelectedYear;
    }

    List<Student> findStudentsOfSelectedGroup(int selectedGroupNumber,
                                              List<Student> listOfStudentsForFiltration) {
        List<Student> ListOfStudentsForSelectedGroupNumber = new ArrayList<>();
        Iterator<Student> iterator = listOfStudentsForFiltration.iterator();
        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();
            if (currentStudent.getGroupNumber() == selectedGroupNumber) {
                ListOfStudentsForSelectedGroupNumber.add(currentStudent);
            }
        }
        return ListOfStudentsForSelectedGroupNumber;
    }
}