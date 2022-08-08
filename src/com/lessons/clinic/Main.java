package com.lessons.clinic;

/**
 * Задание:
 * Написать систему записи и обследования у врача используя наследование.
 * Наследование нужно будет реализовать в сервисах. Общий сервис обследования будет включать некоторые общие услуги, например:
 * сдать анализы; проверить рост, вес. Эти операции будут проводиться для всех пациентов
 * При выводе в консоль ипользовать переопределенный метод toString()
 * так же в классах-сущностях (Doctor, Patient и тд) переопределить equals() и hashCode() (для тренировки)
 */
public class Main {

    public static void main(String[] args) {

        Clinic clinicAbc = createClinicAbc();
        System.out.println(clinicAbc.toString());

        Patient patientOlga = createPatientOlga();
        Patient patientRon = createPatientRon();
        Patient patientKim = createPatientKim();
        Patient patientJim = createPatientJim();

        /*System.out.println(patientJim.toString());
        System.out.println(patientKim.toString());
        System.out.println(patientOlga.toString());
        System.out.println(patientRon.toString());*/

        VisitToTheClinic visitToTheClinic = new VisitToTheClinic();

        visitToTheClinic.visitToTheClinic(patientJim, clinicAbc);
        visitToTheClinic.visitToTheClinic(patientKim, clinicAbc);
        visitToTheClinic.visitToTheClinic(patientOlga, clinicAbc);
        visitToTheClinic.visitToTheClinic(patientRon, clinicAbc);

        System.out.println(clinicAbc.toString());

        System.out.println(patientJim.toString());
        System.out.println(patientKim.toString());
        System.out.println(patientOlga.toString());
        System.out.println(patientRon.toString());

    }

    private static Clinic createClinicAbc() {
        Doctor[] doctors = new Doctor[3];
        doctors[0] = new Doctor("Mike Wazowski", "893236", true, 300, "Heart disease");
        doctors[1] = new Doctor("Elen Kutu", "4378023", true, 250, "Eye disease");
        doctors[2] = new Doctor("Polina Pom", "4364723", false, 100, "Eye disease");

        Clinic clinic = new Clinic("ABC", doctors);

        return clinic;
    }

    private static Patient createPatientOlga() {
        Disease[] diseases = new Disease[2];
        diseases[0] = new Disease("Heart disease", 135);
        diseases[1] = new Disease("Eye disease", 100);

        MedicalCard medicalCard = new MedicalCard(diseases);
        Patient patient = new Patient("Olga Pavlova", "4859493", medicalCard);

        return patient;
    }

    private static Patient createPatientRon() {
        Disease[] diseases = new Disease[1];
        diseases[0] = new Disease("Heart disease", 165);

        MedicalCard medicalCard = new MedicalCard(diseases);
        Patient patient = new Patient("Ron Weasley", "65743", medicalCard);

        return patient;
    }

    private static Patient createPatientKim() {
        Disease[] diseases = new Disease[1];
        diseases[0] = new Disease("Eye disease", 50);

        MedicalCard medicalCard = new MedicalCard(diseases);
        Patient patient = new Patient("Kim Weasley", "687743", medicalCard);

        return patient;
    }

    private static Patient createPatientJim() {
        Disease[] diseases = new Disease[2];
        diseases[0] = new Disease("Heart disease", 100);
        diseases[1] = new Disease("Eye disease", 30);

        MedicalCard medicalCard = new MedicalCard(diseases);
        Patient patient = new Patient("Jim Dies", "484545", medicalCard);

        return patient;
    }
}
