import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N : ");
        int n = sc.nextInt();
        int i = 1 ;
        int Sum = 0;
        while (i <= n) {
            Sum = Sum + i ;
            i++;
        }
        System.out.println("Sum of N Natural numbers is  "+Sum);
    }
}
