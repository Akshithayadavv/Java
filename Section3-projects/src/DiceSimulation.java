import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args)
    {
        Random random =new Random();

        int dieVal;

        for(int i=0;i<10;i++)
        {
            dieVal=random.nextInt(6)+1;
            System.out.println(dieVal);

        }
    }
}
