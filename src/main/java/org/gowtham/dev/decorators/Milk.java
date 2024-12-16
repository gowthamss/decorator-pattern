package org.gowtham.dev.decorators;

import org.gowtham.dev.*;

public class Milk extends CondimentDecorator
{
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
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else {
            cost += 0.20;
        }
        return cost;
    }
}
