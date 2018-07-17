/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs;

import Stats.StatsTable;
import dnd.cs.ABC.Backgrounds.Acolyte;
import dnd.cs.ABC.Class.ClassBase;
import dnd.cs.ABC.ClassAndLevel;
import dnd.cs.Skill.Skills;

/**
 *
 * @author Uldyssian
 */
public class DnDCS {

    public String charName;
    public ClassAndLevel classAndLevel;
    public Object background;
    public String playerName;
    public static StatsTable  stats;
    public int inspiration;
    public Skills skills;
    
    public DnDCS(){
    this.stats = new StatsTable();
    this.classAndLevel = new ClassAndLevel();
    }
    public DnDCS(String charName,
            String theClass, int level,
            String background,
            String playerName,
            int charisma, int con, int dex, int inteligence, int str, int wis,
            int inspiration,
            boolean Acrobatics, boolean Animal_Handling, boolean Arcana,
            boolean Athletics, boolean Deception, boolean History,
            boolean Insight, boolean Intimidation,boolean Investigation,
            boolean Medicine, boolean Nature, boolean Perception,
            boolean Performance,boolean Persuasion, boolean Religion,
            boolean sleightOfHand,boolean Stealth,boolean Survival)
    {
        this.charName = charName;
        this.classAndLevel = new ClassAndLevel(ClassBase.getClass(theClass,level), level);
        this.background = new Acolyte();//needs actual implementation
        this.stats = new StatsTable(str, dex, con, inteligence, wis, charisma);
        this.inspiration = inspiration;

        this.skills = new Skills(this.stats, this.classAndLevel.theClass.profBonusVal,
                Acrobatics,Animal_Handling,Arcana,
                Athletics,Deception,History,
                Insight,Intimidation,Investigation,
                Medicine,Nature,Perception,Performance,Persuasion,
                Religion,sleightOfHand,Stealth,Survival);
        
    }

}
