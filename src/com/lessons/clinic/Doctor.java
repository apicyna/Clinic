package com.lessons.clinic;

public class Doctor {
    private String fullName;
    private String phoneNumber;
    private boolean status;
    private int heal; // ресурс доктора (сколько еще может лечить)
    private String specialty;

    public Doctor(String fullName, String phoneNumber, boolean status, int heal, String specialty) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.heal = heal;
        this.specialty = specialty;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "\nДоктор. Имя: " + getFullName() + ", номер телефона: " +
                getPhoneNumber() + ", ресурс: " + getHeal() + ", статус: " + status + ", специальность: " + specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() == o.getClass()) {
            Doctor outsideObject = (Doctor) o;
            return fullName.equals(outsideObject.fullName)
                    && phoneNumber.equals(outsideObject.phoneNumber)
                    && heal == outsideObject.heal
                    && status == outsideObject.status
                    && specialty.equals(outsideObject.specialty);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = status ? 1231 : 1237;
        result = result * 31;
        result = result + getFullName().hashCode() + getPhoneNumber().hashCode() + getSpecialty().hashCode();
        result = result * 31;
        return result;
    }
}
