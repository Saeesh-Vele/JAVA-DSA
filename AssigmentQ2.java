import java.util.Scanner;

public class AssigmentQ2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number ;
       int choice ;
       int EvenSum = 0;
       int OddSum = 0;
       do {
        System.out.println("Enter the number you want to enter ");
        number = sc.nextInt();
        if (number % 2 == 0) {
            EvenSum = EvenSum + number;
        }else{
            OddSum = OddSum + number;
        }
        System.out.println("If you want to continue press 1 and if you want to sto then press 0");
        choice = sc.nextInt();
       } while (choice == 1);

       System.out.println(EvenSum + " is the sum of even Numbers .");
       System.out.println(OddSum + " is the sum of odd Numbers .");
    }
}