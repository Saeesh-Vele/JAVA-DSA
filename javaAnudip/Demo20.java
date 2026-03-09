
import java.util.Scanner;

public class Demo20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 Values in Array :");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i +1 ; j < 5 ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            
        }
        System.out.println("The Accending order is : " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
    }
}
