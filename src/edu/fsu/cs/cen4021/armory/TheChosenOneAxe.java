package edu.fsu.cs.cen4021.armory;

import java.io.*;
import java.util.Scanner;

/**
 * @author Sam Puckett (sep13b)
 * TheChosenOneAxe determines damage by reading from thechosenone.txt file.
 * Its damange is equal to the first line in which a different string from the rest appears.
 */
class TheChosenOneAxe extends BasicWeapon implements Weapon
{
    TheChosenOneAxe()
    {
        super(0);
        int damage = 0;
        try
        {
            File f = new File("conf/thechosenone.txt");
            Scanner file = new Scanner(f);
            int line = 0;
            if (file.hasNext())
            {
                String s1 = file.nextLine();
                if (file.hasNext())
                {
                    String s2 = file.nextLine();
                    line += 2;
                    if (!s1.equals(s2))
                    {
                        if (file.hasNext())
                        {
                            String s3 = file.nextLine();
                            line++;
                            if (s1.equals(s3))
                            {
                                damage = 2;
                            }
                            else
                            {
                                damage = 1;
                            }
                        }
                    }
                    else
                    {
                        if (file.hasNext())
                        {
                            s2 = file.nextLine();
                            line++;
                            while (file.hasNext() && s1.equals(s2))
                            {
                                line++;
                                s2 = file.nextLine();
                            }
                        }
                    }
                }
            }
            damage = line;
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File thechosenone.txt not found");
        }
        super.DAMAGE = damage;
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
            return (DAMAGE - armor);
        }
    }

}