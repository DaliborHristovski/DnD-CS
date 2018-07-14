/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stats;

import dnd.cs.DnDCS;

/**
 *
 * @author Uldyssian
 */
public class StatsTable {

    public Strenght STRENGTH;
    public Dexterity DEXTERITY;
    public Constitution CONSTITUTION;
    public Inteligence INTELIGENCE;
    public Wisdom WISDOM;
    public Charisma CHARISMA;

    public StatsTable() {
        STRENGTH = new Strenght();
        DEXTERITY = new Dexterity();
        CONSTITUTION = new Constitution();
        INTELIGENCE = new Inteligence();
        WISDOM = new Wisdom();
        CHARISMA = new Charisma();
    }

    public StatsTable( int str, int dex,int con, int inteligence,int wis, int charisma) {
        STRENGTH = new Strenght(str);
        DEXTERITY = new Dexterity(dex);
        CONSTITUTION = new Constitution(con);
        INTELIGENCE = new Inteligence(inteligence);
        WISDOM = new Wisdom(wis);
        CHARISMA = new Charisma(charisma);
    }

}
