import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {


            System.out.println("i = " + i);
        }

        byte x = 100; //max 127
        int y = 123; //max 2,147,483,647
        double z = 123.45; //max 1.7976931348623157E308
        boolean a = true; //max true or false
        char symbol = 'A'; //max 65535 - one character
        String name = "John"; //max 2,147,483,647
        String lastName; //returns null

        System.out.println("x = " + symbol);

        //swap two variables

        int first = 5;
        int second = 10;

        int temp = first;
        first = second;
        second = temp;

        System.out.println("first = " + first);
        System.out.println("second = " + second);

        Scanner scanner = new Scanner(System.in); //Scanner object

        System.out.println("Enter your name: ");
        String name1 = scanner.nextLine(); //makes above line a input variable

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // after nextInt() you need to add this line to make the nextLine() work

        System.out.println("what is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name1 + "!");
        System.out.println("You are " + age + " years old!");
        System.out.println("Your favorite food is " + food + "!");

        //casting
        double friends = 10;
        friends = (double) friends / 3;
        System.out.println(friends);

    }
}