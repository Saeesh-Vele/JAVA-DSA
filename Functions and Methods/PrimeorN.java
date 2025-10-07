import java.util.Scanner;

public class PrimeorN {

    public static boolean yesorno(int X) {
        if (X <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }
        for (int i = 2; i * i <= X; i++) {
            if (X % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        
        int A = sc.nextInt();
        boolean Answer = yesorno(A);
        
        if (Answer) {
            System.out.println(A + " is a Prime Number");
        } else {
            System.out.println(A + " is not a Prime Number");
        }
        
        sc.close();
    }
}
