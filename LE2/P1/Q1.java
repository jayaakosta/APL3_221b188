abstract class Animal {
    abstract void makeVoice();
}


class Cow extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Cow says: Moo!");
    }
}

class Dog extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Dog says: Woof!");
    }
}

class Pig extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Pig says: Oink!");
    }
}

class Goat extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Goat says: Baa!");
    }
}

class Lion extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Lion says: Roar!");
    }
}


class Voice {
    private Animal[] animals = new Animal[5];

    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice(); 
        }
    }
}


public class Q1 {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice(); 
        voice.hear(); 
    }
}