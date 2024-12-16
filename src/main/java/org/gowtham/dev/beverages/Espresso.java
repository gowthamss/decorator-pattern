package org.gowtham.dev.beverages;

import org.gowtham.dev.Beverage;

public class Espresso extends Beverage
{
    public Espresso()
    {
        description = "Espresso";
    }

    public double cost()
    {
        return 1.69;
    }
}
