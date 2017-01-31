package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon simpleArrow = WeaponFactory.getWeapon("simple arrow");
        System.out.println("Simple arrow has " + simpleArrow.hit() + " of damage.");
        System.out.println("Simple arrow was able to do " + simpleArrow.hit(armor) + " of damage to an armor with " + armor + " points.");

        Weapon simpleAxe = WeaponFactory.getWeapon("simple axe");
        System.out.println("Simple axe has " + simpleAxe.hit() + " of damage.");
        System.out.println("Simple axe was able to do " + simpleAxe.hit(armor) + " of damage to an armor with " + armor + " points.");
        int armor2 = 10;
        System.out.println("Simple axe was able to do " + simpleAxe.hit(armor2) + " of damage to an armor with " + armor2 + " points.");

    }
}
