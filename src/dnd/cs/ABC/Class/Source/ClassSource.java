/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs.ABC.Class.Source;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Dante
 */
public enum ClassSource {

   Thief,Barbarian,Assasin,Priest,Paladin;
   
   
   public static List<String> getClassList()
   {
   return Stream.of(ClassSource.values())
                               .map(Enum::name)
                               .collect(Collectors.toList());
   }
}
