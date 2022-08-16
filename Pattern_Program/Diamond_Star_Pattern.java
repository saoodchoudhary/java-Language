package Pattern_Program;

import java.util.Scanner;

public class Diamond_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
<<<<<<< HEAD
         *
         * *
         * *
         * *
         * *
         * *
         *
=======
            * 
           * * 
          *   *
         *     *
          *   *
           * *
            * 
>>>>>>> d336535628aa9e75f18edc78e446d0a4b6a29c82
         */
        System.out.println("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("");
            } else {
                System.out.println("*");
            }
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2 * (i - 1); k++) {
                System.out.print(" ");
            }
            if (i == 1)
                System.out.println("");
            else
                System.out.println("*");
        }
    }
}
