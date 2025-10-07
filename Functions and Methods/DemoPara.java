import java.util.Scanner;

public class DemoPara {
    public static int Sum(int X , int Y){
     int sum = X+Y;
     return sum;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers for Addition :");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Answer = Sum(A, B);
        System.out.println("The Sum of "+A+" And "+B+" is "+Answer);
    }
}
