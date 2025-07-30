public class Omnivore implements DietBehavior
{
    // This is overriding the DietBehavior to implement the omnivore diet
    @Override
    public String eat()
    {
        // this animal only eats plants and meat
        return "this animal eats only plants and meat: this is considered omnivore"; 
    }
}