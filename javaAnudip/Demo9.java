
import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int org_num = num;
        int rev_num = 0;
        while(num > 0){
            int rem = num % 10;
            rev_num = (rev_num*10) + rem ;
            num /= 10 ;
            
        }
       if (org_num == rev_num) {
        System.out.println(org_num + " is Plaindrome  ");
       }else{
        System.out.println( org_num+" is not Plaindrome");
       }
    }
}