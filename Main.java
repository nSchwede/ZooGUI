public class Main {
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
    // Todo A wolf woulk more bark
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

    // fish
    Salmon salmon = new Salmon(herbivore, swim, chirp);
    Shark shark = new Shark(carnivore, swim, growl);

    // Create an array of all animals
    Animal[] animals = {
            brownBear, blackBear, lion, ocelot, orangutan, baboon,
            wolf, hyena, blackWidow, scorpion, prayingMantis, dungBeetle,
            robin, parrot, emperorPenguin, kingPenguin, snake, komodoDragon,
            salmon, shark
    };

    // implementation to fix compilation error
    class CarnivoreDiet implements DietBehavior {
        @Override
        public String eat() {
            return "Eating meat.";
        }
    }

    class HerbivoreDiet implements DietBehavior {
        @Override
        public String eat() {
            return "Eating plants.";
        }
    }

    class OmnivoreDiet implements DietBehavior {
        @Override
        public String eat() {
            return "Eating both plants and meat.";
        }
    }

    class WalkBehavior implements MoveBehavior {
        @Override
        public String move() {
            return "Walking.";
        }
    }

    class FlyBehavior implements MoveBehavior {
        @Override
        public String move() {
            return "Flying.";
        }
    }

    class SwimBehavior implements MoveBehavior {
        @Override
        public String move() {
            return "Swimming.";
        }
    }

    class RoarSound implements SoundBehavior {
        @Override
        public String sound() {
            return "Roaring.";
        }
    }

    class ChirpSound implements SoundBehavior {
        @Override
        public String sound() {
            return "Chirping.";
        }
    }

    class GrowlSound implements SoundBehavior {
        @Override
        public String sound() {
            return "Growling.";
        }
    }

    public static void main(String[] args) {
        // Create an instance of Main to access non-static members
        Main main = new Main();
        // Create GUI object
        GUI gui = new GUI();
        // Construct the GUI
        gui.ConstructGUI();
        // Demonstrate behaviors for all animals
        for (Animal animal : main.animals) {
            animal.performEat();
            animal.performMove();
            animal.performSound();
            System.out.println("Animal: " + animal.getClass().getSimpleName());
            System.out.println("------------------");
        }

    }
}