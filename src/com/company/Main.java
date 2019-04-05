package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String[] arg = new String[3];
        Scanner Scaner = new Scanner(System.in);

        for (int i = 0; i<arg.length; ++i)
        {
            arg[i] = Scaner.nextLine();
        }

        switch (arg[0])
        {
            case "+":
                System.out.println(Double.parseDouble(arg[1]) + Double.parseDouble(arg[2]));
                break;
            case "-":
                System.out.println(Double.parseDouble(arg[1]) - Double.parseDouble(arg[2]));
                break;
            case "/":
                System.out.println(Double.parseDouble(arg[1]) / Double.parseDouble(arg[2]));
                break;
            case "*":
                System.out.println(Double.parseDouble(arg[1]) * Double.parseDouble(arg[2]));
            default:
                break;
        }
    }
}
