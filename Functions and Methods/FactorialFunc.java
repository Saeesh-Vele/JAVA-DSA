import java.util.Scanner;

public class FactorialFunc {
    public static int Factorial(int X){
    int Fact = 1;
    for (int i = 2; i <= X; i++) {
         Fact = Fact * i ;
    } 
    return Fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int A = sc.nextInt();
        int Ans  = Factorial(A);
        System.out.println("The Factorial of the "+A+" is "+Ans);
    }
}
