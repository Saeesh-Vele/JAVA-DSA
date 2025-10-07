import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Food Of Choice");
        int Menu = sc.nextInt();
        switch (Menu) {
            case 1: System.out.println("VadaPav");
                break;
            case 2: System.out.println("Burger");
                break;
            case 3: System.out.println("Mango Shake");
                break;
            default: System.out.println("Not On Menu");
        }
    }
}
