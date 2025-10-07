import java.util.Scanner;

public class AssignmentQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Find Factorial :");
        int A = sc.nextInt();
        int Factorial = 1 ;
        for (int i = 2; i <=A; i++) {
            Factorial = Factorial * i ; 
        }
        System.out.println(Factorial + " is the Factorial of "+ A);

    }
}
