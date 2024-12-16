package org.gowtham.dev.decorators;

import org.gowtham.dev.*;

public class Whip extends CondimentDecorator
{
    private double cost = 0.3;

    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override public String getDescription()
    {
        return beverage.getDescription() + ", Whip";
    }

    @Override public double cost()
    {
        return beverage.cost() + cost;
    }
}
