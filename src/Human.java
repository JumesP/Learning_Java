public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.printf("%s is eating", this.name);
        System.out.println();
    }

    void drinking() {
        System.out.printf("%s is drinking *burp*", this.name);
        System.out.println();
    }
}
