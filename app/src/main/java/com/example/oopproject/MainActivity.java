package com.example.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser = new User();
        myUser.name = "Hasan";
        myUser.job = "Musician";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";
        */

        User myUser = new User("Hasan","Musician");
        System.out.println(myUser.information());

        System.out.println(myUser.name);

        //Encapsulation

        Musician james = new Musician("James","Guitar",50);
        System.out.println(james.getInstrument());
        james.setAge(60,"Hasan");
        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        //Static Polymorphism

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(4,3,7));

        //Dynamic Polymorphism

        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        //Abstract & Interface

        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();

    }
}
