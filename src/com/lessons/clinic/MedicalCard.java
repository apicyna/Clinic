package com.lessons.clinic;

import java.util.Arrays;

public class MedicalCard {
    private Disease[] disease;
    private boolean generalCheckUp;
    private int weight;
    private int growth;

    public MedicalCard (Disease[] disease) {
        this.disease = disease;
        this.generalCheckUp = false;
        this.weight = 0;
        this.growth = 0;
    }

    public Disease[] getDisease() {
        return disease;
    }

    public void setDisease(Disease[] disease) {
        this.disease = disease;
    }

    public boolean isGeneralCheckUp() {
        return generalCheckUp;
    }

    public void setGeneralCheckUp(boolean generalCheckUp) {
        this.generalCheckUp = generalCheckUp;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        String diseases = new String();
        for (Disease dis : disease) {
            diseases = dis.toString() + diseases;
        }
        return "\nМедицинская карта пациента: " + diseases + "\nРост: " + growth + ", вес: " + weight + "\n";
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
            MedicalCard outsideObject = (MedicalCard) o;
            return Arrays.equals(disease, outsideObject.disease)
                    && generalCheckUp == outsideObject.generalCheckUp
                    && weight == outsideObject.weight
                    && growth == outsideObject.growth;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = generalCheckUp ? 1231 : 1237;
        result = result + (((disease.hashCode() * 31 + weight)  * 31) + growth) * 31;
        return result;
    }
}
