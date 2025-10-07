import java.util.Scanner;

public class AssingnmentQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year you want to check :");
        int Year = sc.nextInt();
        if (Year%4==0) {
            if (Year%100==0) {
                if (Year%400==0) {
                    System.out.println(Year+" is a Leap Year");
                }
                else{
                    System.out.println(Year +" is not a Leap Year");
                }
            }
            else{
                System.out.println(Year+" is a Leap Year");
            }
        }
        else{
            System.out.println(Year +" is not a Leap Year");
        }
    }
}
