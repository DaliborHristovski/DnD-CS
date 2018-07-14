/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs.Skill;
/**
 *
 * @author Uldyssian
 */
public class Skill {
   public boolean proficient;
   public int value;
   
   //maybe add description or something like that
  
   
   public Skill(int modifier, int proficiencyBonus, boolean proficient){
     this.value = modifier + (proficient? proficiencyBonus:0);
     this.proficient = proficient;
   } 
}
