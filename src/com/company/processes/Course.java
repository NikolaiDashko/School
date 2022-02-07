package com.company.processes;

public enum Course {
    BIOLOGY("БИОЛОГИЯ"), CHEMISTRY("ХИМИЯ"), PHYSICAL_CULTURE("фИЗИЧЕСКАЯ КУЛЬТУРА"),
    MATHEMATICS("МАТЕМАТИКА"), PHYSIC("ФИЗИКА"), ASTRONOMY("АСТРОНОМИЯ");
    private final String nameOfCourse;

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    Course(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }
}
