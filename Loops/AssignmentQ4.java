import java.util.Scanner;

public class AssignmentQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int A= sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int Ans = i * A;
            System.out.println(A+ " X "+ i + " = "+ Ans);
            
        }
    }
}
