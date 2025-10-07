import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse :");
        int A = sc.nextInt();
        while (A > 0 ) {
            int LastDigit = A%10;
            System.out.print(LastDigit);
            A = A/10;
        }
    }
}
