
import java.util.Scanner;

public class Demo13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Arithmaic Calculator -------------");
        double  a , b , ans;
        int opp;
        System.out.println("Enter the operands a and b : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter the operator (1 : + ,2 : - ,3 : * , 4 : /) : ");
        opp = sc.nextInt();
        switch (opp) {
            case 1:
                ans = a + b;
                System.out.println("The Sum is : " + ans);
                break;
            case 2:
                ans = a - b;
                System.out.println("The Difference is : " + ans);
                break;
            case 3:
                ans = a * b;
                System.out.println("The Product is : " + ans);
                break;
            case 4:
                if (b != 0) {
                    ans = a / b;
                    System.out.println("The Quotient is : " + ans);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator selected.");
        }
        

    }
}