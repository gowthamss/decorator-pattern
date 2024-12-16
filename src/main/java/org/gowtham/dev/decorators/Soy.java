package org.gowtham.dev.decorators;

import org.gowtham.dev.*;

public class Soy extends CondimentDecorator
{
    private double cost = 0.6;
    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override public String getDescription()
    {
        return beverage.getDescription() + ", Soy";
    }

    @Override public double cost()
    {
        return beverage.cost() + cost;
    }
}
