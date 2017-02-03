package edu.fsu.cs.cen4021.armory;

/**
 * @author Sam Puckett (sep13b)
 * Simple axe whose damage is constant at 60
 * and ignores all armor, if it is between 0 and 20.
 */
class SimpleAxe extends BasicWeapon implements Weapon
{

    SimpleAxe()
    {
        super(60);
    }

    @Override
    public int hit()
    {
        return DAMAGE;
    }

    @Override
    public int hit(int armor)
    {
        if (armor > 0 && armor < 20)
        {
            return DAMAGE;
        }
        else
        {
            if (DAMAGE - armor < 0)
            {
                return 0;
            }
            else
            {
                return DAMAGE - armor;
            }
        }
    }
}
