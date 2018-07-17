/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs.ABC.Class;

/**
 *
 * @author Dante
 */
public class Barbarian extends ClassBase{

    
    
    public Barbarian(){
    super();
    this.hitDie = 12;
    this.safeHitPoints = 7;
    proficiencyBonusArray();
    }
    public Barbarian(int level){
    this();
    this.profBonusVal = proficiencyBonus(level);
    }

    
    @Override
    public void proficiencyBonusArray() {
        
        for(int i=0;i<20;i++){
        if(i == 0){this.profArray[i] = 0;
        }else if(i<6){this.profArray[i] = 2;
        }else if(i<9){ this.profArray[i] = 3;
        }else if(i<13){ this.profArray[i] =4;
        }else if(i<17){ this.profArray[i] = 5;
        }else if(i>=17){ this.profArray[i] = 6;
        }
    }
    }
    
   
}
