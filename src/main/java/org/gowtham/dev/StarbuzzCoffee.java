package org.gowtham.dev;

import org.gowtham.dev.beverages.*;
import org.gowtham.dev.decorators.*;

public class StarbuzzCoffee
{
    public static void main(String[] args)
    {
        Beverage b = new Espresso();
        System.out.println(b.getDescription() + " $" + b.cost());

        /*
            DarkRoast with double Mocha with whip
         */
        Beverage b2 = new DarkRoast();
        b2.setSize(Beverage.Size.GRANDE);
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " $" + b2.cost());

        /*
            HouseBlend with Soy, Mocha, and Whip
         */
        Beverage b3 = new HouseBlend();
        b3.setSize(Beverage.Size.GRANDE);
        b3 = new Soy(b3);
        b3 = new Mocha(b3);
        b3 = new Whip(b3);
        System.out.println(b3.getDescription() + " $" + b3.cost());
    }
}