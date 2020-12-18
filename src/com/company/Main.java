package com.company;

abstract class Animal {
    /*
     *  Class serves for creating animals
     */

    public String name;
    public abstract void getName();
}

class Squirrel extends Animal {
    public String name = "Fox";

    @Override
    public void getName() {
        System.out.println("Squirrel " + name);
    }
}

class Chipmunk extends Animal {
    public String name = "Nox";

    @Override
    public void getName() {
        System.out.println("Chipmunk " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Squirrel s = new Squirrel();
        s.getName();
        Chipmunk c = new Chipmunk();
        c.getName();

    }
}
