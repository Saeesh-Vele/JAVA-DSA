import java.util.Scanner;

public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number you want to Check :");
        int A = sc.nextInt();
        if (A >= 0) {
            System.out.println(A+ " is a Positive Number");
        }
        else{
            System.out.println(A+ " is Negative Number");
        }
    }
}
