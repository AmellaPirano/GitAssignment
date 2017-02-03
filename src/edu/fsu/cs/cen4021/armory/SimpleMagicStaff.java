package edu.fsu.cs.cen4021.armory;

/**
 * @author Sam Puckett (sep13b)
 * Simple magic staff whose damage is constant at 80 and ignores 20% of armor
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon
{

    SimpleMagicStaff()
    {
        super(80);
    }

    @Override
    public int hit()
    {
        return DAMAGE;
    }

    @Override
    public int hit(int armor)
    {
        return (int) (DAMAGE - (armor * 0.8));
    }

}