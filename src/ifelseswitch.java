public class ifelseswitch {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 75) {
            System.out.println("Ok Boomer!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }

        boolean isStudent = true;
        boolean isSmart = false;

        if (isStudent && isSmart) {
            System.out.println("You are a student!");
        } else if (isStudent && !isSmart) {
            System.out.println("You are not a smart student!");
        } else {
            System.out.println("You are not a student and not smart!");
        }

        if (1 > 3) {
            System.out.println("number comparison was true!");
        }

        if ("a" == "a") {
            System.out.println("String comparison was true!");
        }

        if (1 >= 3) {
            System.out.println("number comparison was true!");
        }

        if ("a" != "a") {
            System.out.println("String comparison was true!");
        }

        if (!(1 > 3)) {
            System.out.println("number comparison was true!");
        }

        if (!(1 == 1)) {
            System.out.println("number comparison was true!");
        }

        int month = 3;

        switch (month) {
            case 1:
                System.out.println("January");
                break; //breaks out of the switch statement
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
        }

        String month1 = "January";

        switch (month1) {
            case "January":
                System.out.println("January");
                break; //breaks out of the switch statement
            case "February":
                System.out.println("February");
                break;
            case "March":
                System.out.println("March");
                break;
        }

        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("You got an A! ");
                break;
            case "B":
                System.out.println("You got a B! ");
                break;
            case "C":
                System.out.println("You got a C! ");
                break;

        }

        // && = and
        // || = or
        // ! = not

        // create an example of an if statement using and, or and not statements
        int num1 = 10;
        int num2 = 50;
        boolean isTrue = true;

        if ((num1 > num2) && isTrue) {
            System.out.println("num1 is greater than num2, and isTrue is true.");
        }

        if ((num1 < num2) || !isTrue) {
            System.out.println("num1 is less than num2, or isTrue is false.");
        }


    }
}

