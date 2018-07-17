/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs.utilities;

import dnd.cs.CharFrame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Dante
 */
public class StatsRoller {

    public static String[] finalRolls = new String[6];

    public StatsRoller() {
        finalRolls = rollAll();
    }

    public static String[] rollAll() {

        for (int i = 0; i < 6; i++) {
            int min = 0;
            int curr = 0;
            int summOfBestRolls = 0;
            for (int j = 0; j < 4; j++) {
                curr = rollD6();
                if (j > 0) {
                    if (curr >= min) {
                        summOfBestRolls += curr;
                    } else if (curr < min) {
                        summOfBestRolls += min;
                        min = curr;
                    }
                } else if (j == 0) {
                    min = curr;
                }
            }
            //Not sure if correct but you reroll scores under 10
            if(summOfBestRolls>9){
            finalRolls[i] = (String.valueOf(summOfBestRolls));
            }else i--;
        }
            return finalRolls;
    }
    public static String[] takeStandard(){
        String[] val = {"15","14","13","12","10","8"};
        return val;
    }
    
    public static int rollD4() {
       return rollSidedDie(4);
    }
    public static int rollD6() {
       return rollSidedDie(6);
    }
    public static int rollD8() {
       return rollSidedDie(8);
    }
    public static int rollD10() {
       return rollSidedDie(10);
    }
    public static int rollD12() {
       return rollSidedDie(12);
    }
    public static int rollD20() {
       return rollSidedDie(20);
    }        
    
    
    public static int rollSidedDie(int i){
         return (int) ((Math.random() * i) + 1);
    }
    
    public static boolean statInputCheck( Integer[] v){
    
        Integer[] n = new Integer[6];
        for( int x =0; x < 6 ; x++){ n[x]= Integer.valueOf(CharFrame.lists[x]);}
        Arrays.sort(n, (Integer x, Integer y) -> x - y);
        Arrays.sort(v, (Integer x, Integer y) -> x - y);
        return Arrays.equals(n, v);
    }
    
  
}
