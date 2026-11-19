import java.util.Scanner;

//Declares class and scanner
public class Grades3DArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        //Declares the 3D Array, and a 1D Array for subjects
        float[][][] grades = new float[2][3][3];
        String[] subjects = {"Java", "Database", "Networking"};

        //This is the outer loop that will iterate the Layers
        for (int l = 0 ; l < 2 ; l++) {
            System.out.println("Section " + (l + 1));
            System.out.println("------------------------");
            float SectionTotal = 0;

            //The Middle Loop that will iterate the rows for the students and value for total
            for (int r = 0 ; r < 3 ; r++) {
                System.out.println("Student " + (r + 1));
                float StudentTotal = 0;

                //Inner Loop that is for user input grades, and totals the grades of students
                for (int c = 0 ; c < 3 ; c++) {
                    float GradeAverage = 0;
                    System.out.print("Enter " + subjects[c] + ": ");
                    grades[l][r][c] = sc.nextFloat();
                    StudentTotal += grades[l][r][c];
                }
                //Will calculate each student's average then prints it
                float StudentAverage = StudentTotal / 3;
                System.out.printf("Student Average: %.2f%n", StudentAverage);
                SectionTotal += StudentAverage;
                System.out.println();
            }
            //After all averages have been calculated, it will get section average then prints it
            float SectionAverage = SectionTotal / 3;
            System.out.printf("Section Average: %.2f%n", SectionAverage);
            System.out.println();
        }
        sc.close();
    }
    
}
