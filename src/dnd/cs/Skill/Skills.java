/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs.Skill;

import Stats.StatsTable;

/**
 *
 * @author Uldyssian
 */
public class Skills {

    public Skill Acrobatics;
    public Skill Animal_Handling;
    public Skill Arcana;
    public Skill Athletics;
    public Skill Deception;
    public Skill History;
    public Skill Insight;
    public Skill Intimidation;
    public Skill Investigation;
    public Skill Medicine;
    public Skill Nature;
    public Skill Perception;
    public Skill Performance;
    public Skill Persuasion;
    public Skill Religion;
    public Skill sleightOfHand;
    public Skill Stealth;
    public Skill Survival;

    public Skills(StatsTable stats, int proficiencyBonus,
            boolean Acrobatics, boolean Animal_Handling, boolean Arcana,
            boolean Athletics, boolean Deception, boolean History,
            boolean Insight, boolean Intimidation, boolean Investigation,
            boolean Medicine, boolean Nature, boolean Perception,
            boolean Performance, boolean Persuasion, boolean Religion,
            boolean sleightOfHand, boolean Stealth, boolean Survival) {

        this.Acrobatics = new Skill(stats.DEXTERITY.getModifier(), proficiencyBonus, Acrobatics);
        this.Animal_Handling = new Skill(stats.WISDOM.getModifier(), proficiencyBonus, Animal_Handling);
        this.Arcana= new Skill(stats.INTELIGENCE.getModifier(), proficiencyBonus, Arcana);
        this.Athletics = new Skill(stats.STRENGTH.getModifier(), proficiencyBonus, Athletics);
        this.Deception = new Skill(stats.CHARISMA.getModifier(), proficiencyBonus, Deception);
        this.History = new Skill(stats.INTELIGENCE.getModifier(), proficiencyBonus, History);
        this.Insight = new Skill(stats.WISDOM.getModifier(), proficiencyBonus, Insight);
        this.Intimidation = new Skill(stats.CHARISMA.getModifier(), proficiencyBonus, Intimidation);
        this.Investigation = new Skill(stats.INTELIGENCE.getModifier(), proficiencyBonus, Investigation);
        this.Medicine = new Skill(stats.WISDOM.getModifier(), proficiencyBonus, Medicine);
        this.Nature = new Skill(stats.INTELIGENCE.getModifier(), proficiencyBonus, Nature);
        this.Perception = new Skill(stats.WISDOM.getModifier(), proficiencyBonus, Perception);
        this.Performance = new Skill(stats.CHARISMA.getModifier(), proficiencyBonus, Performance);
        this.Persuasion = new Skill(stats.CHARISMA.getModifier(), proficiencyBonus, Persuasion);
        this.Religion = new Skill(stats.INTELIGENCE.getModifier(), proficiencyBonus, Religion);
        this.sleightOfHand = new Skill(stats.DEXTERITY.getModifier(), proficiencyBonus, sleightOfHand);
        this.Stealth = new Skill(stats.DEXTERITY.getModifier(), proficiencyBonus, Stealth);
        this.Survival = new Skill(stats.WISDOM.getModifier(), proficiencyBonus, Survival);

    }
}
