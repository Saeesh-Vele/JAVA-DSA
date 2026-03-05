
import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
           int rem = num % 10;
           sum += rem;
           num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
