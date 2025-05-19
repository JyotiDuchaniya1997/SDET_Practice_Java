import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Even_Odd_Lists {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,4,65,76,7,6,5,3,3,4));
        int even=0, odd=0;
        for( int i=0; i<list.size();i++){
            if(list.get(i)%2==0){ even++; }
            else{ odd++; }
        }
        System.out.print("The count of even numbers is "+ even + " and that of odd is "+ odd);
    }
}
