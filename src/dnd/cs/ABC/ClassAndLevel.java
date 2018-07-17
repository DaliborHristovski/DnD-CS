/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs.ABC;

import dnd.cs.ABC.Class.ClassBase;

/**
 *
 * @author Dante
 */
public class ClassAndLevel {
    public ClassBase theClass;
    public int level;
    
    public ClassAndLevel(){
    }
    
    public ClassAndLevel(ClassBase theClass,int level){
        this.theClass = theClass;
        this.level = level;
    }
}
