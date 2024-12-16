package org.gowtham.dev;

public abstract class Beverage
{
    protected String description = "Unknown description";;

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}
