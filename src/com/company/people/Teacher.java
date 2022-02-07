package com.company.people;

import com.company.processes.Course;
import com.company.rating.Assessment;

import java.util.Scanner;

public class Teacher {

    private final String name;
    private String graduation;
    private final String primaryCourse;

    public Teacher(String name, String graduation, String primaryCourse){
        this.name = name;
        this.graduation = graduation;
        this.primaryCourse = primaryCourse;
    }

    public String getName() {
        return name;
    }

    public String getGraduation() {
        return graduation;
    }

    public void deliverALecture() {
    }

    public void whatGraduation(Teacher teacher, Course course) {
        System.out.println(teacher.getName() + " имеет " + teacher.getGraduation() + " по предмету " + course.getNameOfCourse()+ "!");
    }

    public int setAnEstimate(Teacher teacher) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        System.out.println("Учитель " + teacher.getName() + " ставит оценку - " + mark);
        return mark;
    }


}
