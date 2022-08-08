package com.lessons.clinic;

public class Disease {
    private String name;
    private int severity;

    public Disease(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "\nНазвание болезни: " + name + ", сила: " + severity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disease outsideObject = (Disease) o;
        return name.equals(outsideObject.getName())  &&
                severity == outsideObject.getSeverity();
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + severity;
        return result;
    }
}
