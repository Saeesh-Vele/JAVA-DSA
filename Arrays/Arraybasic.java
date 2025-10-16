
import java.util.Scanner;

public class Arraybasic {

public static void main(String[] args) {
    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);
    System.err.println("Enter the Marks of Math , Chem and Phy");
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("Maths : " + marks[0]);
    System.out.println("Chem : " + marks[1]);
    System.out.println("Phy : " + marks[2]);
    System.out.println("The Average of the three subjects is : " + (marks[0] + marks[1] + marks[2]) / 3);
    sc.close();
}
	
}