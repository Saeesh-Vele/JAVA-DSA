
import java.util.Scanner;

public class Demo17 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        System.out.println("Enter 5 Values for Array A :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            a[i] = sc.nextInt();
    }
        System.out.println("Enter 5 Values for Array B :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            b[i] = sc.nextInt();
        }
    }
}