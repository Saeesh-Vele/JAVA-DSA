
import java.util.Scanner;

public class AssignmentQ3 {

    public static boolean isPalindrome(int number){
        int Ognumber = number;
        int rev = 0;
        while (number != 0) {
            int digit = number % 10 ;
            rev = rev*10 + digit ;
            number = number / 10 ;
        }
        return Ognumber == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a palindrome:");
        int num = sc.nextInt();
        boolean result = isPalindrome(num);
        if (result) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome."); 
        } 
        
    }
}