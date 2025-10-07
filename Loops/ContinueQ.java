import java.util.Scanner;

public class ContinueQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int A = sc.nextInt();
            if (A%10==0) {
                continue;
            }
            System.out.println(A);
        } while (true);
    }
}
