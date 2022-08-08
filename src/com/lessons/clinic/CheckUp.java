package com.lessons.clinic;

import java.util.Random;

// Общие услуги: рост и вес
public class CheckUp {

    public void checkUp(Patient patient) {
        Random random = new Random();
        patient.getMedicalCard().setGeneralCheckUp(true);

        int randomInt = random.nextInt(40);
        patient.getMedicalCard().setWeight(randomInt + 60);
        randomInt = random.nextInt(60);
        patient.getMedicalCard().setGrowth(randomInt + 140);
    }
}
