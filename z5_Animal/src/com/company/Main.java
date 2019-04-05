package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Animal Cat = new Animal("Kiciuś", 1998);
        Animal Dog = new Animal("Burek", 2010);
        Animal Zebra = new Animal("Mariusz", 2015);

        System.out.println(Cat.toString());
        System.out.println(Dog.toString());
        System.out.println(Zebra.toString());

        Cat.setAge(2009);

        System.out.println(Cat.toString());

        Cat.getAge();
        Dog.getAge();
        Zebra.getAge();
    }
}
