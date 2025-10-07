import java.util.Scanner;

public class BreakQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        do {
            int A =sc.nextInt();
            if (A%10==0) {
                break;
            }
            System.out.println(A);
        } while (true);
    }
}
