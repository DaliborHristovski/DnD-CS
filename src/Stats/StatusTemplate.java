/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stats;

/**
 *
 * @author Uldyssian
 */
abstract class Stats extends StatsTable{

    int value;
    int modifier;
    
    // implement saving throws
    boolean proficient;
    int savingThrow;   
    
    

    public boolean isProficient() {
        return proficient;
    }

    public void setProficient(boolean proficient) {
        this.proficient = proficient;
    }

    public int getSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(int savingThrow) {
        this.savingThrow = savingThrow;
    }

    public void modValue(int value) {
        this.value += value;
        this.modifier =modModifier(value);
    }

    public int modModifier(int value) {
        if (value == 1)return -5;
        
        switch (value/2) {
            case 1:  return -4;
            case 2:  return -3;
            case 3:  return -2;
            case 4:  return -1;
            case 5:  return 0;
            case 6:  return 1;
            case 7:  return 2;
            case 8:  return 3;
            case 9:  return 4;
            case 10:  return 5;
            case 11:  return 6;
            case 12:  return 7;
            case 13:  return 8;
            case 14:  return 9;
            case 15:  return 10;
            default: System.out.println("Invalid value!");return 0;
        }
    }

    public int getValue() {
        return value;
    }

    public int getModifier() {
        return modifier;
    }
}
