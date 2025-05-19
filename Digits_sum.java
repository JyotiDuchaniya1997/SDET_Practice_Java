public class Digits_sum {
    public static void main(String[] args) {
        
        int x=6789;
        int x1=x;
        int r, sum=0;
        while(x!=0){
            r=x%10;
            x=x/10;
            sum=sum+r;
        }
        System.out.println("Sum of the digits of "+ x1 +" is "+sum);
    }
}
