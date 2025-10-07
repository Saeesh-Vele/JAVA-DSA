import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        boolean IsPrime = true ;
        if (A == 2) {
            System.out.println("2 is a Prime Number");
        }else{
            for (int i = 2; i <=Math.sqrt(A) ; i++) {
                if (A%i==0) {
                    IsPrime = false;
                }
            }
        }

        if (IsPrime == true) {
            System.out.println(A +" is a Prime Number.");
        }else{
            System.out.println(A +" is a not Prime Number.");
        }
        
    }
}