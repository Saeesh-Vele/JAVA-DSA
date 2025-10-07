public class FuncOverLoad {
    public static int Sum(int X ,  int Y){
        int Ans  = X + Y ;
        return Ans;

    }
 
    public static int Sum(int X ,  int Y , int Z ){
        int Ans  = X + Y + Z ;
        return Ans;
        
    }



    public static void main(String[] args) {
        int Ans = Sum(1, 2);
        int ans = Sum(1, 2, 3);
        System.out.println(Ans);
        System.out.println(ans);
    }
}
