interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

interface Swimmable {
    void swim();
}

interface Squeakable {
    void squeak();
}

interface Muteable {
    void mute();
}

abstract class Duck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("This duck swims.");
    }
}

class RubberDuck extends Duck implements Squeakable {
    @Override
    public void squeak() {
        System.out.println("Rubber duck squeaks.");
    }
}

class WoodenDuck extends Duck implements Muteable {
    @Override
    public void mute() {
        System.out.println("Wooden duck is mute.");
    }
}

class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("RedHeadDuck flies.");
    }

    @Override
    public void quack() {
        System.out.println("RedHeadDuck quacks.");
    }
}

class LakeDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("LakeDuck flies.");
    }

    @Override
    public void quack() {
        System.out.println("LakeDuck quacks.");
    }
}

public class DuckGame {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        rubberDuck.swim();
        rubberDuck.squeak();

        woodenDuck.swim();
        woodenDuck.mute();

        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
