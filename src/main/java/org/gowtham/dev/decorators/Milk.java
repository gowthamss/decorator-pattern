package org.gowtham.dev.decorators;

import org.gowtham.dev.*;

public class Milk extends CondimentDecorator
{
    private double cost = 0.4;

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override public String getDescription()
    {
        return beverage.getDescription() + ", Milk";
    }

    @Override public double cost()
    {
        return beverage.cost() + cost;
    }
}
