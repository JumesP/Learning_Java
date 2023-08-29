public class methodss {
    public static void main(String[] args) {

        // methods - like functions

        // RETURN TYPES

        // -- void gets rid of the function when its done with it, voids it, into the void

        // -- if you want it to return something, replace void with the data type





        String name = "James";
        int age = 21;

        hello("Sienna", 18);
        hello(name, age); // calling hello function
        hello("George", 20);

        int x = 3;
        int y = 4;

        int z = add(x, y);
        System.out.println(z);

        System.out.println(add(x , y));
    }

    static void hello(String name, int age) {
        System.out.println("Hello! " + name);
        System.out.println("You are age: " + age);

        // static is needed if its being called by a static, such as main
    }

    static int add(int x, int y) {
        return x + y;

        //ans = x + y;
        //return ans;
    }
}
