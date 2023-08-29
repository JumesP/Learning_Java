public class Overload {
    public static void main(String[] args) {

        int x = add(1, 2);
        int y = add(1, 2, 3, 4);
        int z = add(1, 2, 3);

        double a = add(1.1, 2.1);
        double b = add(1.1, 2.1, 3.1, 4.1);
        double c = add(1.1, 2.1, 3.1);

        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("Overload 1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overload 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overload 3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("Overload 5");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("Overload 5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("Overload 6");
        return a + b + c + d;
    }
}
