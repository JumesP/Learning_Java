public class printf {
    public static void main(String[] args) {

        //printf()
        // has to arguements = format string + object/variable/value

        // first is the text, including the %d, which is the location of the stuff after the ,
        // second the code/ variable used

        // %d means int
        // %b mean boolean
        // %c means characters / char
        // %s means string
        // %f means float / decimal

        // conversion characters
        boolean myBoolean = true;
        System.out.printf("%b", myBoolean);
        System.out.println();

        char myChar = '@';
        System.out.printf("%c", myChar);
        System.out.println();

        String name = "James";
        System.out.printf("%s", name);
        System.out.println();

        int age = 22;
        System.out.printf("%d", age);
        System.out.println();

        double myDouble = 1000000;
        System.out.printf("%f", myDouble);
        System.out.println();


        System.out.printf("%d This is a format string %d" , 123, 456);
        System.out.println();

        //width
        System.out.printf("Hello %-10s", name); // adds spaces before (- for after) the string is printed
        System.out.println();

        //precision
        System.out.printf("num is: %.2f ", myDouble); // prints to a certain level of presision when producing values
        System.out.println();

        //flags
        // adds and effect to the output based on the flag added to the format specifier
        // - : left justify, used in width
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are padded with 0
        // , : comma grouping superator, 1,000,000 etc.

        System.out.printf("you have %,2f dollars", myDouble);
    }
}
