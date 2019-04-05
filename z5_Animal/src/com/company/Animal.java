package com.company;

import java.time.LocalDateTime;

public class Animal {

    private String _name;
    private int _yearOfBorn;
    static String zoo;
    //z7 - dodanie pól counter i id, przypisanie do id kolejnego numeru
    static int counter = 0;
    final int id;

    public Animal(String name, int yearOfBorn)
    {
        _name = name;
        _yearOfBorn = yearOfBorn;
        id = counter++;
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
