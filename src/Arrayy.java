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
    }
}