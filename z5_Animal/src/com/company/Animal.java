package com.company;

import java.time.LocalDateTime;

public class Animal {

    private String _name;
    private int _yearOfBorn;
    static String zoo;

    public Animal(String name, int yearOfBorn)
    {
        _name = name;
        _yearOfBorn = yearOfBorn;
    }

    public void getAge()
    {
        System.out.println(LocalDateTime.now().getYear() - _yearOfBorn);
    }

    public void setAge(int yearOfBorn)
    {
        _yearOfBorn = yearOfBorn;
    }

    public String toString()
    {
        return "Zwierzę to nazywa się: " + this._name + ". Urodziło się w " + this._yearOfBorn + " roku.";
    }
}
