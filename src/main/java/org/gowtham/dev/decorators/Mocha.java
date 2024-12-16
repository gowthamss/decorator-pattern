package org.gowtham.dev.decorators;

import org.gowtham.dev.*;

public class Mocha extends CondimentDecorator
{
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
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.20;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.30;
        } else {
            cost += 0.40;
        }
        return cost;
    }
}
