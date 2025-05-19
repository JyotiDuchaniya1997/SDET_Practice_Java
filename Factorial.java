public class Factorial {
    public static void main(String[] args) {
        System.out.print(factorial(5));
    }
    public static double factorial(int x){
        if(x<=1) return x;
        return x* factorial(x-1);
    }
}
