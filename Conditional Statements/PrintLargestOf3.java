import java.util.Scanner;

public class PrintLargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A>B && A>C) {
            System.out.println(A + " is the largest number ");
        }
        else if (B>C) {
            System.out.println(B + " is the largest number ");
        }
        else{
            System.out.println(C + " is the largest number ");
        }
    }
}
