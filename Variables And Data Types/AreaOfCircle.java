import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float R = sc.nextFloat();
        Float Area = (3.14f * R * R) ;
        System.out.println(Area);
    }
}
