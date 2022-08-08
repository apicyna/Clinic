package com.lessons.clinic;

public class VisitToTheClinic extends Healing {

    public void visitToTheClinic(Patient patient, Clinic clinic) {
        Disease[] diseases = patient.getMedicalCard().getDisease();

        for (Disease disease : diseases) {
            Doctor doctor = findTheDoctor(disease, clinic);
            if (doctor == null) {
                System.out.println("\nДля пациента " + patient.getFullName() + " в этой больнице нет подходящего доктора\n");
            } else {
                healing(patient, disease, doctor);
            }
        }
    }

    private Doctor findTheDoctor(Disease disease, Clinic clinic) {
        for (Doctor iDoc : clinic.getDoctors()) { // смотрим всех врачей
            if (disease.getName().equals(iDoc.getSpecialty())
                    && iDoc.isStatus()
                    && iDoc.getHeal() >= disease.getSeverity()) {
                return iDoc;
            }
        }
        return null;
    }
}
