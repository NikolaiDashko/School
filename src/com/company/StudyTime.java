package com.company;


import com.company.live.Journal;
import com.company.live.Lesson;
import com.company.processes.Course;

import static com.company.TestSpace.pupilNikolai;

public class StudyTime {

    public StudyTime() {
        super();
    }

    public static void main(String[] args) {
        System.out.println("Начался урок!");
        Lesson physicsLesson;
        TestSpace testSpace = new TestSpace(physicsLesson = new Lesson
                (TestSpace.teacherFeynman, TestSpace.pupilNikolai, Course.PHYSIC, 9));
        testSpace.testingLessons(physicsLesson);






    }
}
