/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs.ABC.Class;

import Stats.StatsTable;
import static dnd.cs.CharFrame.currSheet;
import dnd.cs.utilities.StatsRoller;
/**
 *
 * @author Dante
 */
public abstract class ClassBase {
    //public StatsTable cStatsMod;
    public int profBonusVal;
    public int[] profArray = new int[20];
    public int hitDie;
    public int safeHitPoints;
    public int currhitPoints;
    public int maxHitPoints;
    public int tempHitPoints;
    
    
    
    public ClassBase(){
     //cStatsMod =  new StatsTable();
    }
    
    public void addLevelUpHPRoll()
    {
        int i = (StatsRoller.rollSidedDie(hitDie)+ conMod());
        this.maxHitPoints += i;
        this.currhitPoints += i;
    }
    public void addFirstHitLevelUP(){
        this.maxHitPoints += this.hitDie+conMod();
        this.currhitPoints += this.hitDie+conMod();
        
    }
    
    public abstract void proficiencyBonusArray();
    
    public int proficiencyBonus(int level)
    {
        return profArray[level-1];
    }
    
    public int conMod(){
     return currSheet.stats.CONSTITUTION.getModifier();
    }
    
    
    public static ClassBase getClass(String className, int level){
        switch(className){
            case "Barbarian" : return new Barbarian(level);
            case "Bard" : return new Bard();
            case "Cleric" : return new Cleric();
            case "Druid" : return new Druid();
            case "Fighter" : return new Fighter();
            case "Monk" : return new Monk();
            case "Paladin" : return new Paladin();
            case "Ranger" : return new Ranger();
            case "Rogue" : return new Rogue();
            case "Sorcerer" : return new Sorcerer();
            case "Warlock" : return new Warlock();
            case "Wizard" : return new Wizard();
            default : return null;
        }
    }
}
