import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Arrayy {
    public static void main(String[] args) {

        // array = used to store multiple values in a variable

        String[] cars = {"Camero", "Corvette", "Tesla"};
        String[] cars2 = new String[3];

        cars2[0] = "mustang";
        cars2[1] = "Ford";
        cars2[2] = "Ferrari";

        for(int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }
        for(int i = 0;i < cars2.length; i++) {
            System.out.println(cars2[i]);
        }
        System.out.println("Hi");
        for (String car : cars) {
            System.out.println(car);
        }

        // arraylist

        ArrayList<String> food = new ArrayList<String>(); // stores reference data types
                                                          // google wrapper types java

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");

        food.set(0, "Sushi"); // changes position 0 with "Sushi"
        food.remove(2); // deletes things in position 2 (3)

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
            System.out.println("HI");
        }

        food.clear(); // clears it

        // for each loop

        String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals2 = new ArrayList<String>();

        animals2.add("cat");
        animals2.add("dog");
        animals2.add("rat");
        animals2.add("bird");

        for(String i : animals) { // less steps, more readable but less flexable than standard for loop
            System.out.println(i);
        }
        for(String j : animals2) { // ":" means in - similar to standard python for loops
            System.out.println(j);
        }



    }
}