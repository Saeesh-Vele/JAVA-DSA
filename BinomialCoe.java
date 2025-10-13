import java.util.Scanner;

public class BinomialCoe {
    public static int Factorial(int X){
    int Fact = 1;
    for (int i = 2; i <= X; i++) {
         Fact = Fact * i ;
    } 
    return Fact;
    }

    public static double Binomial(int N , int R){
        int A = Factorial(N);
        int B = Factorial(R);
        int C = Factorial(N-R);
        double Bino = A/(B*C);
        return Bino ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N anf R :");
        int N = sc.nextInt();
        int R = sc.nextInt();
        double Ans = Binomial(N, R);
        System.out.println("The Binomial Coeficient is "+ Ans);

    }
}

