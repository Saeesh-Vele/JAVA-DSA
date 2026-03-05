
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int rev_num = 0;
        while(num > 0){
            int rem = num % 10;
            rev_num = (rev_num*10) + rem ;
            num /= 10 ;
            
        }
        System.out.println(rev_num);
    }
}
