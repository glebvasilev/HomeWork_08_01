package com.company;

abstract class Animal {
    /*
     *  Class serves for creating animals
     */

    public String name;
    public String family;
    public abstract void getName();
}

class Squirrel extends Animal {
    public String name = "Fox";
    public String family = "Squirrel";

    @Override
    public void getName() {
        System.out.println(family + " " + name);
    }
}

class Chipmunk extends Animal {
    public String name = "Nox";
    public String family = "Chipmunk";

    @Override
    public void getName() {
        System.out.println(family + " " + name);
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
