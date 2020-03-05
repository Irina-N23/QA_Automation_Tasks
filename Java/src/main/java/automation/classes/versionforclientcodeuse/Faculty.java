package automation.classes.versionforclientcodeuse;

public enum Faculty {
    FACULTY_OF_PHYSICS("Physics"),
    FACULTY_OF_ECONOMICS("Economics"),
    FACULTY_OF_LAW("Law");

    private String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    @Override
    public String toString() {
        return getFacultyName();
    }
}