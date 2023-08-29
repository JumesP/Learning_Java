import java.util.Random; // poorly names i know!

public class DiceRollers {

    int num = 0; // global
    DiceRollers() {
        Random random = new Random();
        int number = 0; // local
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
