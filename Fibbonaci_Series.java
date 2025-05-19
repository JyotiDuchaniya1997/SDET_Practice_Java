import java.util.ArrayList;
import java.util.List;

public class Fibbonaci_Series {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int n=10;
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print(first+",");
            }
            else if(i==1){
                System.out.print(second+",");
            }
            else{
                int new_num=first+second;
                System.out.print(new_num+",");
                    first=second;
                second= new_num;
            }
        }
        List<Integer> ser= fabonacci(n);
        System.out.println(ser);
        /*Recursion*/
        
    }
    public static List<Integer> fabonacci(int n){
        List<Integer> series= new ArrayList<>();
        if(n==0){
            return series;
        }
        series.add(0);
        if(n==1){
            return series;
        }
        series.add(1);
        for(int i=2; i<n;i++){
            int next= series.get(i-2)+ series.get(i-1);
            series.add(next);
        }
        return series;
    }
}
