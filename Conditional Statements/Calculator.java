import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number For Calculation :");
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Enter the operations you want to perform ");
        char Operator = sc.next().charAt(0);
        int Ans = 0;
        switch (Operator) {
            case '+': Ans = A + B;
                break;
            case '-': Ans = A - B;
                break;
            case '*': Ans = A * B;
                break;
            case '/': Ans = A / B;
                break;
            case '%': if (B != 0) {
                Ans = A % B;
            }
            else{
                System.out.println("Wrong Number For This Calculation");
            };
                break;
            default: System.out.println("This is Opreator is not in Calculator");
        }
        System.out.println("Answer is "+ Ans);
    }
}
