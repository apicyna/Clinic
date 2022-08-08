package com.lessons.clinic;

public class Patient {
    private String fullName;
    private String phoneNumber;
    private MedicalCard medicalCard;

    public Patient(String fullName, String phoneNumber, MedicalCard medicalCard) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.medicalCard = medicalCard;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    @Override
    public String toString() {
        return "Пациент. Имя: " + getFullName() + ", номер телефона: " + getPhoneNumber() + medicalCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() == o.getClass()) {
            Patient outsideObject = (Patient) o;
            return fullName.equals(outsideObject.fullName)
                    && phoneNumber.equals(outsideObject.phoneNumber)
                    && medicalCard.equals(outsideObject.medicalCard);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = getMedicalCard().hashCode() + getFullName().hashCode() + getPhoneNumber().hashCode();
        result = result * 31;
        return result;
    }
}
