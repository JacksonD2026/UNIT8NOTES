public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");
      // Declare 2D arrays [[]]

      int[][] coordinates;
    
      // Create 2D array of a certain nmuber
      // of ROWS and COLUMNS
      coordinates = new int[5][5];
      // default values for int : 0


      // INITIALIZE [declare + create]
      String[][] seatingChart = new String[3][4];
      // default values for String : null;

      // set values in a 2D array
      seatingChart[0][0] = "Jackson";
      seatingChart[1][0] = "Finny";
      seatingChart[2][0] = "Bryce";
      seatingChart[2][1] = "Natalie";
      seatingChart[2][2] = "Paige";
      seatingChart[2][3] = "Zoie";
      seatingChart[0][0] = "Alex";
      seatingChart[0][3] = "Maia";

      // Initializer list
      // alternate way to initialize array
      // when you know which values go where

      int [][] minefield = {{7, -20, 0}, {0, 50, -15}, {-10, 12, 20}};

      // ACCESS a value with a double index operator
      // array[row][col]
      System.out.println("You earned " + minefield[1][1] + " points");

      int worstSpot = minefield [0][1];

      for (String[] row : seatingChart) {
         // Inner loop iterates through column values
         // "for every string item in the row array"
         for (String col : row) {
            System.out.println(col + "");
         }
         System.out.println(); // break between two rows
      }

      // Cannot use for-each if you want to modify values or iterate in a different order

      //array.length repressents the number of rows in the 2d array
      for (int row = 0; row < minefield.length; row++) {
         // array[0].length repersents number of columbs in a row
         for (int col = 0; col < minefield[0].length; col++) {
            // if spot is a bomb replace it
            if (minefield[row][col] < 0) {
               minefield[row][col] = minefield[row][col] * -1;
            }
            System.out.print("[" + minefield[row][col] + "]");
         }
         System.out.println();
      }

      

      

   }
}
