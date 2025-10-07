import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int A = sc.nextInt();
        if (A%2==0) {
            System.out.println(A+" is even number");
        }
        else{
            System.out.println(A+" is odd number");
        }
    }
}
