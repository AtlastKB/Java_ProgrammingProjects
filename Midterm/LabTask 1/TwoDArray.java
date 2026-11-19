//Keneth D. Batul ITE102
import java.util.Scanner;
//Declare Class with method, and making scanner
public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //To redo the entire program
        char again;
        do { 
            //Declare the array
            int [][]nums = new int[3][3];
            System.out.println("Enter 9 Elements....."); //This will ask the user for the 9 values/elements for the table
            for(int r=0; r<nums.length; r++) {
                for(int c=0; c<nums.length; c++)  {
                    nums[r][c] = scanner.nextInt(); 
                }
            }

            System.out.println("\nHere are the Numbers and the required outputs:"); //Displays the table, and it will also display the format
            System.out.println(" ");
            System.out.println("                          " + "Row Sum");
            int []colSum = new int[3]; //This will add each rows then repeat until all rows are sum, same with columns
            for(int r=0; r<nums.length; r++) {
                int rowSum = 0; 
                for(int c=0; c<nums.length; c++) {
                    System.out.printf("%5d", nums[r][c]);
                    rowSum += nums[r][c];  
                    colSum[c] += nums[r][c]; 
                }
                System.out.printf("%15d\n", rowSum); 
             }
            System.out.printf("%n%-12s", "Column sum:");
            for(int c=0; c<nums.length; c++) {
                System.out.printf("%5d", colSum[c]);
            }
            System.out.println();
            
            int dia1 = 0, dia2 = 0; //This is to add diagonals of the table
            for(int i=0; i<nums.length; i++) {
                dia1 += nums[i][i];
                dia2 += nums[i][nums.length - 1 - i];
            }
            System.out.println("Diagonal sum 1: " + dia1);
            System.out.println("Diagonal sum 2: " + dia2);

            //This will ask the user if they want restart the program. it will go back to line 14 if Y
            System.out.print("\nTry Again [y|n]: ");
            again = scanner.next().charAt(0);
        } while (again == 'y' || again == 'Y'); 
        System.out.println("Goodbye!");
    }
}
