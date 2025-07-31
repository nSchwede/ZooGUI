public class Main {
    public static void main(String[] args) {
        
        DietBehavior carnivore = new CarnivoreDiet();
        DietBehavior herbivore = new HerbivoreDiet();
        DietBehavior omnivore = new OmnivoreDiet();
        MoveBehavior walk = new WalkBehavior();
        MoveBehavior fly = new FlyBehavior();
        MoveBehavior swim = new SwimBehavior();
        SoundBehavior roar = new RoarSound();
        SoundBehavior chirp = new ChirpSound();
        SoundBehavior growl = new GrowlSound();

        // Bears
        BrownBear brownBear = new BrownBear(herbivore, walk, growl);
        BlackBear blackBear = new BlackBear(omnivore, walk, growl);

        // Felines
        Lion lion = new Lion(carnivore, walk, roar);
        Ocelot ocelot = new Ocelot(carnivore, walk, growl);

        // Monkeys
        Orangatang orangutan = new Orangatang(herbivore, walk, chirp);
        Baboon baboon = new Baboon(herbivore, walk, growl);

        // Canines
        //Todo A wolf woulk more bark
        Wolf wolf = new Wolf(carnivore, walk, growl);
        // Todo , a hyena has a creepy laugh
        Hyena hyena = new Hyena(carnivore, walk, growl);

        // Arachnids
        BlackWidow blackWidow = new BlackWidow(carnivore, walk, chirp);
        Scorpion scorpion = new Scorpion(carnivore, walk, growl);

        // Insects
        PrayingMantis prayingMantis = new PrayingMantis(carnivore, walk, chirp);
        DungBeatle dungBeetle = new DungBeatle(herbivore, walk, growl);

        // Birds
        Robin robin = new Robin(herbivore, fly, chirp);
        Parrot parrot = new Parrot(herbivore, fly, chirp);

        // Penguins
        Emperor emperorPenguin = new Emperor(carnivore, swim, chirp);
        King kingPenguin = new King(carnivore, swim, chirp);

        // Reptiles
        Snake snake = new Snake(carnivore, walk, growl);
        KomodoDragon komodoDragon = new KomodoDragon(carnivore, walk, growl);

        //fish
        Salmon salmon = new Salmon(herbivore, swim, chirp);
        Shark shark = new Shark(carnivore, swim, growl);

        // Demonstrate behaviors for all animals
        brownBear.performEat(); brownBear.performMove(); brownBear.performSound();
        blackBear.performEat(); blackBear.performMove(); blackBear.performSound();
        lion.performEat(); lion.performMove(); lion.performSound();
        ocelot.performEat(); ocelot.performMove(); ocelot.performSound();
        orangutan.performEat(); orangutan.performMove(); orangutan.performSound();
        baboon.performEat(); baboon.performMove(); baboon.performSound();
        wolf.performEat(); wolf.performMove(); wolf.performSound();
        hyena.performEat(); hyena.performMove(); hyena.performSound();
        blackWidow.performEat(); blackWidow.performMove(); blackWidow.performSound();
        scorpion.performEat(); scorpion.performMove(); scorpion.performSound();
        prayingMantis.performEat(); prayingMantis.performMove(); prayingMantis.performSound();
        dungBeetle.performEat(); dungBeetle.performMove(); dungBeetle.performSound();
        robin.performEat(); robin.performMove(); robin.performSound();
        parrot.performEat(); parrot.performMove(); parrot.performSound();
        emperorPenguin.performEat(); emperorPenguin.performMove(); emperorPenguin.performSound();
        kingPenguin.performEat(); kingPenguin.performMove(); kingPenguin.performSound();
        snake.performEat(); snake.performMove(); snake.performSound();
        komodoDragon.performEat(); komodoDragon.performMove(); komodoDragon.performSound();
        salmon.performEat(); salmon.performMove(); salmon.performSound();
        shark.performEat(); shark.performMove(); shark.performSound();
    }
}

//implementation to fix compilation error
class CarnivoreDiet implements DietBehavior {
    @Override
    public void eat() {
        System.out.println("Eating meat.");
    }
}

class HerbivoreDiet implements DietBehavior {
    @Override
    public void eat() {
        System.out.println("Eating plants.");
    }
}

class OmnivoreDiet implements DietBehavior {
    @Override
    public void eat() {
        System.out.println("Eating both plants and meat.");
    }
}

interface MoveBehavior {
    void move();
}

class WalkBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Walking.");
    }
}

class FlyBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Flying.");
    }
}

class SwimBehavior implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("Swimming.");
    }
}

interface SoundBehavior {
    void sound();
}

class RoarSound implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("Roaring.");
    }
}

class ChirpSound implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("Chirping.");
    }
}

class GrowlSound implements SoundBehavior {
    @Override
    public void sound() {
        System.out.println("Growling.");
    }
}
