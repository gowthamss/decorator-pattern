package org.gowtham.dev.decorators;

import org.gowtham.dev.*;

public class Mocha extends CondimentDecorator
{
    private double cost = 0.4;
    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost()
    {
        return beverage.cost() + cost;
    }
}
