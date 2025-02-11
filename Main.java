public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");
      // Declare 2D arrays [[]]

      int[][] coordinates;
      String[][] seatingChart;
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
   

      

   }
}
