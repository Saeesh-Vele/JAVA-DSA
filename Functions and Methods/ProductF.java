import java.util.Scanner;

public class ProductF {
    public static int Mul(int X , int Y){
     int product = X*Y;
     return product;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers for Multiplication:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Answer = Mul(A, B);
        System.out.println("The Product of "+A+" And "+B+" is "+Answer);
    }
}
