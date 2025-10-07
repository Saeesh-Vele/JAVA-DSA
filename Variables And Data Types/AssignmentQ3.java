import java.util.Scanner;

public class AssignmentQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Pencil = sc.nextFloat();
        float Pen = sc.nextFloat();
        float Eraser = sc.nextFloat();
        float Cost = Pencil+Pen+Eraser;
        System.out.println("Total Bill is "+Cost);
        Float Tcost =  (float)(Cost + (Cost*0.18));
        System.out.println("Cost With GST is "+Tcost);
    }
}
