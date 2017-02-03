package edu.fsu.cs.cen4021.armory;

import java.io.*;
import java.util.*;

/**
 * @author Sam Puckett (sep13b)
 * AncientMagicStaff determines damage by reading from ancientstaff.obj file.
 * It performs a series of operations on the Integer List object within
 * and sums the result to get the final damage.
 */
class AncientMagicStaff extends BasicWeapon implements Weapon
{

    /**
     * Method for obtaining the object from the file (ln 24-27) taken from StackOverflow.
     * Unchecked warning suppressed because given object file must contain Integer List
     */
    AncientMagicStaff()
    {
        super(0);
        List<Integer> result = new ArrayList<>();

        try
        {
            FileInputStream file  = new FileInputStream(new File("conf/ancientstaff.obj"));
            ObjectInputStream obj = new ObjectInputStream(file);
            //noinspection unchecked
            result = (List<Integer>)obj.readObject();
            obj.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File ancientstaff.obj not found");
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Class not found exception");
        }
        result.remove(1);
        result.remove(4);
        for (int i = 0; i < result.size(); i++)
        {
            result.set(i, (int)Math.pow(result.get(i), 2));
        }
        int j = result.size() - 1;
        int i = 0;
        int tmp;
        while (i < j)
        {
            tmp = result.get(i);
            result.set(i, result.get(j));
            result.set(j, tmp);
            i++;
            j--;
        }
        tmp = 0;
        for(int k : result)
        {
            tmp += k;
        }
        super.DAMAGE = tmp;
    }

    @Override
    public int hit()
    {
        return super.DAMAGE;
    }

    @Override
    public int hit(int armor)

    {
        return (int)(hit() - (0.75 * armor));
    }
}