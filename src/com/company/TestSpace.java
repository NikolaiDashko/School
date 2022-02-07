package com.company;

import com.company.live.Lesson;
import com.company.people.Pupil;
import com.company.people.Teacher;
import com.company.rating.Grade;

public class TestSpace {


    public static Teacher teacherFeynman = new Teacher("Ричард Фейнман", "Профессор", "Физика");
    public static Pupil pupilNikolai = new Pupil("Николай", 15, Grade.ELEVENTH);

    public TestSpace(Lesson lesson) {

    }


    public void testingLessons(Lesson physicsLesson) {
    }
}

