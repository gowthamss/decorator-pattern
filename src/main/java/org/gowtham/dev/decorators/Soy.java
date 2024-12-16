package org.gowtham.dev.decorators;

import org.gowtham.dev.*;

public class Soy extends CondimentDecorator
{
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
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.30;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.45;
        } else {
            cost += 0.60;
        }
        return cost;
    }
}
