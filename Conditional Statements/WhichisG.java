import java.util.Scanner;

public class WhichisG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Both The Numbers :");
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A>B) {
            System.out.println("The Greater Number is "+ A);
        }
        else{
            System.out.println("The Greater Number is "+ B);
        }
    }
}
