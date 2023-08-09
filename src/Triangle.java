import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d = -10;
        double e = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side b: ");
        b = scanner.nextDouble();


        c = Math.max(a, b); //c becomes the highest number between a and b

        System.out.println("the highest number is " + c);



        c = Math.sqrt((a * a) + (b * b)); // SQRT = square root

        System.out.println("The hypotenuse is " + c);



        c = Math.abs(d); // returns the absolute value of d / removes the negative sign

        System.out.println("The absolute value of d is " + c);



        c = Math.round(e); //rounds e to the nearest whole number

        System.out.println("The rounded value of e is " + c);

        c = Math.ceil(e); //rounds e up to the nearest whole number

        System.out.println("The rounded value of e is " + c);

        scanner.close();

    }
}
