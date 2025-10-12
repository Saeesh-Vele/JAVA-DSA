
import java.util.Scanner;

public class AssignmentQ5 {
    
    public static int SumofInt(int Num){
        int OGnumber = Num;
        int sum = 0;
        while (Num != 0) {
            int digit = Num % 10 ;
            sum += digit ;
            Num /= 10;
        }
        return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits:");
        int number = sc.nextInt();
        int result = SumofInt(number);
        System.out.println("The sum of the digits of " + number + " is " + result);
        sc.close(); // always good practice to close Scanner
        
    }
}
