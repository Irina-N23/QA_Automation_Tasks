package automation.classes.consoleapplicationversion;

public enum Faculty {
    FACULTY_OF_PHYSICS("Physics (PHY)"),
    FACULTY_OF_ECONOMICS("Economics (ECON)"),
    FACULTY_OF_LAW("Law (LAW)");

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