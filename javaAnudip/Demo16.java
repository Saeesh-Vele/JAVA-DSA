
import java.util.Scanner;

public class Demo16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int marks[] = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks entered:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Marks of student " + (i + 1) + ": " + marks[i]);
        }
    }
}
