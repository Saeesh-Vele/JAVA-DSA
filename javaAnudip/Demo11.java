
import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = sc.nextInt();
        int sum = 0;
        int org_num = num ;
        while (num > 0) {
           int rem = num % 10;
           sum += (rem*rem*rem);
           num /= 10;
        }
        if (org_num == sum) {
        System.out.println(org_num + " is Armstrong  ");
       }else{
        System.out.println( org_num +" is not Armstrong");
       }    
}
}
    
