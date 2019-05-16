package com.company;

public class Frog extends Animal
{
    Frog(String name, int yearOfBorn)
    {
        super(name, yearOfBorn);
    }

    public String toString()
    {
        return super.toString();
    }

    @Override
    public int eat()
    {
        System.out.println("Żaba " + super.getName() + " je.");
        return super.eat();
    }

    @Override
    public int sleep()
    {
        System.out.println("Żaba " + super.getName() + " śpi.");
        return super.eat();
    }
}

