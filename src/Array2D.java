public class Array2D {
    public static void main(String[] args) {

        //2d array = an array of arrays

        String[][] cars = new String[3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Ford";
        cars[1][0] = "Lambo";
        cars[1][1] = "Tesla";
        cars[1][2] = "Ranger";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Porche";
        cars[2][2] = "final";

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        System.out.println();

        String name = "James";

        boolean result = name.equals("james");
        boolean result2 = name.equalsIgnoreCase("James");

        System.out.println(result);
        System.out.println(result2);

    }
}
