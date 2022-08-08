package com.lessons.clinic;

import javax.print.Doc;

public class Clinic {
    private String name;
    private Doctor[] doctors;

    public Clinic(String name, Doctor[] doctors) {
        this.name = name;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        String allDoctors = new String();
        for (Doctor doc : doctors) {
            allDoctors = doc.toString() + allDoctors + "\n";
        }
        return "Больница: " + name + ", доктора в этой больнице: " + allDoctors;
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
            Clinic outsideObject = (Clinic) o;
            return name.equals(outsideObject.name)
                    && doctors.equals(outsideObject.doctors);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = (name.hashCode() + doctors.hashCode()) * 31;
        return result;
    }
}
