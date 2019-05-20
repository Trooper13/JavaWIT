package com.company;

import java.lang.invoke.MethodHandles;
import java.time.LocalDateTime;

public class Animal {

    private String _name;
    private int _yearOfBorn;
    static String zoo;
    // zjedzona ilość jedzenia w gramach
    private int _eatedFoodWeight;
    // przespany czas w minutach
    private int _sleepedTime;
    //z7 - dodanie pól counter i id, przypisanie do id kolejnego numeru, pamiętać że _counter musi być zawsze polem statycznym
    public static int _counter = 0;
    final int id;

    Animal()
    {
        id = ++_counter;
    }

    Animal(String name, int yearOfBorn)
    {
        _name = name;
        _yearOfBorn = yearOfBorn;
        id = _counter++;
    }

    void getAge()
    {
        System.out.println(LocalDateTime.now().getYear() - _yearOfBorn);
    }

    void setAge(int yearOfBorn)
    {
        _yearOfBorn = yearOfBorn;
    }

    int eat()
    {
        return _eatedFoodWeight;
    }

    int sleep()
    {
        return _sleepedTime;
    }

    public String toString()
    {
        return "Zwierzę to nazywa się: " + this._name + ". " +
                "Urodziło się w " + this._yearOfBorn + " roku. " +
                "Do tej pory zjadło " + this.eat() + " gram jedzenia i przespało " + this.sleep() + " minut.";
    }

    public String getName()
    {
        return _name;
    }

    public int getYearOfBorn()
    {
        return _yearOfBorn;
    }
}
