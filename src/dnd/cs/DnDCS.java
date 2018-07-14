/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs;

import Stats.StatsTable;
import dnd.cs.ABC.Backgrounds.Acolyte;
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
    public StatsTable stats;
    public int proficiencyBonus;
    public int inspiration;
    public Skills skills;
    
    public DnDCS(){}
    public DnDCS(String charName,
            Class theClass, int level,
            String background,
            String playerName,
            int charisma, int con, int dex, int inteligence, int str, int wis,
            int proficiencyBonus,
            int inspiration,
            boolean Acrobatics, boolean Animal_Handling, boolean Arcana,
            boolean Athletics, boolean Deception, boolean History,
            boolean Insight, boolean Intimidation,boolean Investigation,
            boolean Medicine, boolean Nature, boolean Perception,
            boolean Performance,boolean Persuasion, boolean Religion,
            boolean sleightOfHand,boolean Stealth,boolean Survival)
    {
        this.charName = charName;
        this.classAndLevel = new ClassAndLevel(theClass, level);
        this.background = new Acolyte();//needs actual implementation
        this.stats = new StatsTable(str, dex, con, inteligence, wis, charisma);
        this.proficiencyBonus = proficiencyBonus;
        this.inspiration = inspiration;

        this.skills = new Skills(this.stats, this.proficiencyBonus,
                Acrobatics,Animal_Handling,Arcana,
                Athletics,Deception,History,
                Insight,Intimidation,Investigation,
                Medicine,Nature,Perception,Performance,Persuasion,
                Religion,sleightOfHand,Stealth,Survival);
        
    }

}
