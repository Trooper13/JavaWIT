package com.company;

public class Tiger extends Animal
{
    private static int _counter = 0;
    final int _id;

    Tiger()
    {
        _id = ++_counter;
    }

    Tiger(String name, int yearOfBorn)
    {
        super(name, yearOfBorn);
        _id = ++_counter;
    }

    public String toString()
    {
        return super.toString();
    }

    @Override
    public int eat()
    {
        System.out.println("Tygrys " + super.getName() + " je.");
        return super.eat();
    }

    @Override
    public int sleep()
    {
        System.out.println("Tygrys " + super.getName() + " śpi.");
        return super.eat();
    }
}
