import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int Age = sc.nextInt();

        if (Age>19) {
            System.out.println("You Are An Adult");
        }
        else if (Age<20 && Age>12){
            System.out.println("You Are An Teenager");
        }
        else{
            System.out.println("You Are A Child");
        }
    }
}
