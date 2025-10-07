import java.util.Scanner;

public class RevTheOGNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse :");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int LastDigit = n % 10 ;
            rev = (rev * 10) + LastDigit;
            n = n/10; 
        }
        System.out.println(rev);
    }
}
