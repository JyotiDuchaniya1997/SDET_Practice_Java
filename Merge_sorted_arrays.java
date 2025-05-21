import java.util.ArrayList;
import java.util.List;

public class Merge_sorted_arrays {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5,6};
        int[] arr2= {10,11,12,13};
        List<Integer> final_arr = new ArrayList<>();
        for (int num : arr1) {
            final_arr.add(num);
        }
        for(int num1: arr2){
            final_arr.add(num1);
        }
        System.out.println(java.util.Arrays.toString(final_arr.stream().mapToInt(Integer::intValue).toArray()));
    }
}
