public class HelpfulStringManipulation {
    public static void main(String[] args) {
        String name = "James";

        boolean result = name.equals("james"); // if name == ("james")
        boolean result2 = name.equalsIgnoreCase("James"); // ^ same but not cap checker

        int result3 = name.length(); // works out length
        char result4 = name.charAt(0); // finds character at index 0
        int result5 = name.indexOf("o"); // prints position of "o"
        boolean result6 = name.isEmpty(); // prints true if empty string
        String result7 = name.toUpperCase(); // makes it all uppercase
        String result8 = name.toLowerCase(); // makes it all lowercase
        String result9 = name.trim(); //removes whitespace
        String result10 = name.replace("o", "a"); // replaces "o" with "a"

        System.out.println(result);
        System.out.println(result2);
    }
}
