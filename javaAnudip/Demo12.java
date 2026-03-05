import java.util.Scanner;
public class Demo12 {

    public static void main(String[] args) {
        double pf , hra , da , netSal ;
        System.out.println("Enter the Salary: ");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        pf = (salary * 0.12);
        System.out.println("Provident Fund (PF): " + pf);
        hra = (salary * 0.1);
        System.out.println("House Rent Allowance (HRA): " + hra);
        da = (salary * 0.08);
        System.out.println("Dearness Allowance (DA): " + da);
        netSal = salary - (pf + hra + da);
        System.out.println("Net Salary: " + netSal);
    }
}