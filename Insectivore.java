public class Insectivore implements DietBehavior
{
    // This is overriding the DietBehavior to implement the insectivore diet
    @Override
    public String eat()
    {
        // is consider a carnivore, but the animal is also able to eat insects
        // https://youtu.be/K8E_zMLCRNg?si=w3nZBD9U3OK0WlN4
        return "this animal eats like a carnivore but can also eat insects";

    }
}