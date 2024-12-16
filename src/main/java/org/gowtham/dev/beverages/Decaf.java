package org.gowtham.dev.beverages;

import org.gowtham.dev.Beverage;

public class Decaf extends Beverage
{
    public Decaf()
    {
        description = "Decaf";
    }

    public double cost()
    {
        return 1.49;
    }
}
