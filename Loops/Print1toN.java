import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you have to Print :");
        int n = sc.nextInt();
        int i = 1 ;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
