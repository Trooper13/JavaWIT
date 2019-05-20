package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

   /*     Animal Cat = new Animal("Kiciuś", 1998);
        Animal Dog = new Animal("Burek", 2010);
        Animal Zebra = new Animal("Mariusz", 2015);*/

/*      System.out.println(Cat.toString());
        System.out.println(Dog.toString());
        System.out.println(Zebra.toString());

        Cat.setAge(2009);

        System.out.println(Cat.toString());

        Cat.getAge();
        Dog.getAge();
        Zebra.getAge();

        System.out.println(Cat.id);
        System.out.println(Dog.id);
        System.out.println(Zebra.id);
 */
/*        Tiger tygrysek = new Tiger("Szablozębny", 1999);
        System.out.println(tygrysek.toString());

        tygrysek.eat();
        tygrysek.sleep();
        System.out.println(tygrysek.getYearOfBorn());
*/
        //======================> Zadanie 9
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Tiger();
        Animal a4 = new Frog("Frania", 1990);
        Animal a5 = new Animal();

        System.out.println("Id: " + a1.id);
        System.out.println("Id: " + a2.id);
        System.out.println("Id: " + a3.id);
        System.out.println("Id: " + a4.id + ", Imie: " + a4.getName());
        System.out.println("Id: " + a5.id);

        Animal[] animals = new Animal[]{new Frog(), new Frog(), new Frog(), new Frog(), new Tiger(), new Tiger(), new Tiger(), new Animal()};
        for (Animal animal: animals)
        {
            System.out.println("Id: " + animal.id);
        }
        System.out.println("Counter: " + Animal._counter);
        //<======================
    }
}
