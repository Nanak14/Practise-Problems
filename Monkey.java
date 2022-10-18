package org.example;

public class Monkey {

    public void jump(){
        System.out.println("This animal jumps.");
    }
    public void bite(){
        System.out.println("This animal bites.");
    }

}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("This animal is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class forMain{
    public static void main(String[] args) {
        Human human = new Human();

        human.eat();
        human.sleep();

        Monkey gorilla = new Monkey();

        gorilla.bite();
        gorilla.jump();
    }
}
