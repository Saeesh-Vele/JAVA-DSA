
import java.util.Scanner;

public class AssignmentQ2 {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's even or odd:");
        int num = sc.nextInt();
        boolean result = isEven(num);
        if (result) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        sc.close(); // always good practice to close Scanner    
    }
}
