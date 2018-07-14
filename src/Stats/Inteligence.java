/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stats;

/**
 *
 * @author Uldyssian
 */
public class Inteligence extends Stats {

    public Inteligence() {
    }

    public Inteligence(int value) {
        this.value = value;
        this.modifier = modModifier(value);
    }

}
