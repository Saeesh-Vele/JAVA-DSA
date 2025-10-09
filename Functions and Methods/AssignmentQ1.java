import java.util.Scanner;

public class AssignmentQ1 {
    
    public static double Average(int X, int Y, int Z) {
        double avg = (X + Y + Z) / 3.0;  // use 3.0 to get a double result
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers for Average:");
        
        int A = sc.nextInt();  
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        double Answer = Average(A, B, C);
        System.out.println("The average of " + A + ", " + B + " and " + C + " is " + Answer);
        
        sc.close(); // always good practice to close Scanner
    }
}
