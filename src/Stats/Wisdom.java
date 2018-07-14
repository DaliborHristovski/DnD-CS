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
public class Wisdom extends Stats {

    public Wisdom() {
    }

    public Wisdom(int value) {
        this.value = value;
        this.modifier = modModifier(value);
    }

}
