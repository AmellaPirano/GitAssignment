package edu.fsu.cs.cen4021.armory;

/**
 * @author Sam Puckett (sep13b)
 * Simple arrow whose damage is constant at 70 and ignores 5 points of armor
 */
class SimpleArrow extends BasicWeapon implements Weapon
{

    SimpleArrow()
    {
        super(70);
    }

    @Override
    public int hit()
    {
        return DAMAGE;
    }

    @Override
    public int hit(int armor)
    {
        int damage = DAMAGE - (armor - 5);
        if (damage < 0)
        {
            return 0;
        }
        return damage;
    }

}