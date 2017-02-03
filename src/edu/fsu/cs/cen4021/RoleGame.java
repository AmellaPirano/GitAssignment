package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame
{

    public static void main(String[] args)
    {
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

        Weapon simpleStaff = WeaponFactory.getWeapon("simple magic staff");
        System.out.println("Simple magic staff has " + simpleStaff.hit() + " of damage.");
        System.out.println("Simple magic staff was able to do " + simpleStaff.hit(armor) + " of damage to an armor with " + armor + " points.");

        Weapon chosenAxe = WeaponFactory.getWeapon("the chosen one axe");
        System.out.println("Chosen axe has " + chosenAxe.hit() + " of damage.");
        System.out.println("Chosen axe was able to do " + chosenAxe.hit(armor) + " of damage to an armor with " + armor + " points.");

        Weapon ancientStaff = WeaponFactory.getWeapon("ancient magic staff");
        System.out.println("Ancient magic staff has " + ancientStaff.hit() + " of damage.");
        System.out.println("Ancient magic staff was able to do " + ancientStaff.hit(armor) + " of damage to an armor with " + armor + " points.");
    }
}
