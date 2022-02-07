package com.company.people;

import com.company.live.Journal;
import com.company.rating.Assessment;
import com.company.rating.Grade;

public class Pupil {
    private final String name;
    private int age;
    private Grade grade;

    public Pupil(String name, int age, Grade grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        // TODO добавить формулу просчета среднего балла по предмету и по атестату в целом

    }

    public String getName() {
        return name;
    }
    public void attendingCourses(){
        // TODO написать реализацию посещения занятий передавать параметром имя студента, день недели, время,
        //  в каком классе учится и выводить, какой урок посетил, выводить в консоль, что
        //  такой-то ученик посетил такое-то занятие
    }
    public int getAnEstimate(Pupil pupil, int mark, Teacher teacher){
        System.out.println("Ученик " + pupil.getName() + " получает оценку " + mark + " от " + teacher.getName());
        return mark;
    }
}
