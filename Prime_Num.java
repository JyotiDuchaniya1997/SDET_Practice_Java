public class Prime_Num {
     public static void main(String[] args) {
        int n=13;
        boolean is_prime=true;
        for(int i=2;i<n;i++)
            if(n%i==0){
                is_prime= false;
            }
        if(is_prime) System.out.print("This is a prime number");
        else System.out.print("This is not a prime number");
    }
}
