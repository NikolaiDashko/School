package com.company.live;

import com.company.people.Pupil;

public class Journal {
    float averageAssessment;

    public Journal(Pupil pupil) {
    }

    public float averageCalculate(int count, int[] assessments) {
        int sumOfAssessment = 0;
        float average;
        int assessmentCount = 1;
        for (int assessment : assessments) {
            sumOfAssessment = sumOfAssessment + assessment;
        }
        average = sumOfAssessment / (float) assessmentCount;
        averageAssessment = average;
        return averageAssessment;
    }
}
