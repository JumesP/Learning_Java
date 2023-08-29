public class OOP {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.model);

        myCar1.drive();
        myCar2.brake();

        myCar2.colour = "Red"; // changing the colour

        System.out.println(myCar2.colour);



        // constructors

        Human human1 = new Human("James", 22, 80);
        Human human2 = new Human("Rick", 65, 70);

        System.out.println(human1.name);
        System.out.println(human2.age);

        human1.eat();
        human2.drinking();
    }
}
