
import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r ;
        System.out.println("Enter radius of circle");
        r = sc.nextFloat();
        float area = (3.14f * r * r);
        System.out.println("Area of circle is: " + area);
    }
}