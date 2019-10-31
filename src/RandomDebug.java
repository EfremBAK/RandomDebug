import java.util.Random;

public class RandomDebug{
    public static void main(String[] args)
    {
        System.out.println("This will Generate 10 random integers between 0 and 6");
        Random rnd = new Random();

        for (int i = 1; i <= 9; ++i)
        {
            int randomInt = 1 + rnd.nextInt(6);
            System.out.println("Generated number: " + randomInt);
        }

        System.out.println("Done.");
    }


}