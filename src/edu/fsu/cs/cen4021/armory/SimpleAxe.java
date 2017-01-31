package edu.fsu.cs.cen4021.armory;

/**
 * @author Sam Puckett (sep13b)
 */
class SimpleAxe extends BasicWeapon implements Weapon {

    SimpleAxe() {
        super(60);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if(armor > 0 && armor < 20)
        {
            return DAMAGE;
        }
        else
        {
            return (DAMAGE - armor);
        }
    }

}
