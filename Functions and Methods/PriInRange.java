import java.util.Scanner;

public class PriInRange {

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

    public static void PrimeinR(int A , int B){
        boolean IfPrime ;
        for (int i = A; i <= B; i++) {
            if(yesorno(i)){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        PrimeinR(Num1, Num2);
    }
}
