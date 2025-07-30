public class Herbivore implements DietBehavior
{
    // This is overriding the DietBehavior to implement the herbivore diet
    @Override
    public String eat()
    {
        // https://youtube.com/shorts/WeentRXSfKU?si=t0nBhnTUMBLxeOOY
        //This animal eats plants
        return "animal eats plants";
    }
}