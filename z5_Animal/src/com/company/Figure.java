package com.company;

public class Figure {

    private double _x, _y;
    private String _color;
    private final int _id;
    private static int _counter = 0;


    public Figure(double x, double y, String color)
    {
        _x = x;
        _y = y;
        _color = color;
        _id = ++_counter;
    }

    double area()
    {
        return 0.0;
    }

    double parimeter()
    {
        return 0.0;
    }

    void move (double x, double y)
    {

    }

    protected void finalize()
    {
        _counter = --_counter;
    }
}
