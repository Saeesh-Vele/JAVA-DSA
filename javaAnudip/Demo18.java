import java.util.Scanner;

public class Demo18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values : ");
        int numStudents = sc.nextInt();
        int marks[] = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks entered:");
        for (int i = numStudents - 1; i >= 0; i--) {
            System.out.println( marks[i]);
        }
    }
}