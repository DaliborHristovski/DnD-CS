/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.cs.utilities;

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
                curr = roll6D();
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
            finalRolls[i] = (String.valueOf(summOfBestRolls));
        }
            return finalRolls;
}

    

    public static int roll6D() {
        return (int) ((Math.random() * 6) + 1);
    }
}
