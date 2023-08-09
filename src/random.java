import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6) + 1; //random number between 1 and 6
                                        // + 1 is to make it between 1 and 6 instead of 0 and 5
                                        // blank is between -2,147,483,648 and 2,147,483,647

        double y = random.nextDouble(); //random number between 0 and 1
        boolean z = random.nextBoolean(); //random true or false

        System.out.println(x + " " + y + " " + z);
    }
}
