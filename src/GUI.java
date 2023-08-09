import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); //converts string to int

        if (age > 18) {
            JOptionPane.showMessageDialog(null,
                    "You are an adult! You are " + age + " years old!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "You are a child! You are only" + age + " years old!");
        }

        String food = JOptionPane.showInputDialog("What is your favorite food?");
        JOptionPane.showMessageDialog(null, "Your favorite food is " + food + "!");
    }


}
