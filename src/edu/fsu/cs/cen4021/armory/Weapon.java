
package edu.fsu.cs.cen4021.armory;

/**
 * @author Javier
 */
public interface Weapon {

    /**
     * @return base damage
     */
    int hit();

    /**
     * @param armor - the armor rating of the opponent
     * @return damage done against given armor
     */
    int hit(int armor);
}
