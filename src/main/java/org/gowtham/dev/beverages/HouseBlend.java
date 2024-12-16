package org.gowtham.dev.beverages;

import org.gowtham.dev.Beverage;

public class HouseBlend extends Beverage
{
    public HouseBlend()
    {
        description = "House Blend Coffee";
    }

    public double cost()
    {
        return 0.89;
    }
}
