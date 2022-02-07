package com.company.live;

import com.company.people.Pupil;
import com.company.people.Teacher;
import com.company.processes.Course;
import com.company.processes.Education;



public class Lesson extends Education {

    public Lesson(Teacher teacher, Pupil pupil, Course course, int numberClassroom){
    }


    public void courseInTime(Lesson lesson) {
        System.out.println("Учитель " );

    }




        // TODO сделать реализацию, что идет урок передавая имя учителя
        //  и в каком классе, выводить, что такой то учитель ведет такой-то урок в определенном
        //  классе
        //  1) избавиться от static
        //  2) минимизировать связанность
        //  3) передавать  параметры методам
        //  4) для каждого класса данных создать класс сервисов, которые будут управлять этим классом


}
