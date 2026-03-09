import java.util.Scanner;

class rectangle{
    int len , width , area ;
    Scanner sc = new Scanner(System.in);

    public void accept(){
        System.out.println("Enter Length :");
        len = sc.nextInt();
        System.out.println("Enter Width :");
        width = sc.nextInt();
    }

    public void calculate(){
        area = len * width ;
        System.out.println("The area of the rectangle is : "+area);
    }
}

public class RectMain{
    public static void main(String[] args){
        rectangle rc = new rectangle();
        rc.accept();
        rc.calculate();
    }
}
