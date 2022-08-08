package com.lessons.clinic;

public class Healing extends CheckUp {

    public void healing(Patient patient, Disease disease, Doctor doctor) {
        if (!patient.getMedicalCard().isGeneralCheckUp()) {
            checkUp(patient);
        }
        doctor.setHeal(doctor.getHeal() - disease.getSeverity());
        disease.setSeverity(0);
        printTreatmentInfo(patient, doctor);
    }

    private void printTreatmentInfo (Patient patient, Doctor doctor) {
        System.out.println("\nПациента " + patient.getFullName() + " лечит врач " + doctor.getFullName());
    }
}
