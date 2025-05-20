import java.util.ArrayList;
import java.util.List;

public class Missing_no_in_Sorted_Sequnce {
    public static void main(String[] args) {
       int[] list= {1,2,4,6,7,8,9,13};
        List<Integer> missing = new ArrayList<Integer>();
        for( int i=1; i<list.length; i++){
            if(list[i-1] == list[i]-1){
                continue;
            }
            else{
                int start=list[i-1];
                int end=list[i];
                while(start< end-1){
                    missing.add(start+1);
                    start=start+1;
                }
            }
        } 
        System.out.println(missing);
    }  
}
