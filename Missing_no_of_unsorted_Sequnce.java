import java.util.Arrays;

public class Missing_no_of_unsorted_Sequnce {
    public static void main(String[] args) {
        int[] list= {4,3,5,6,2,1,9,8};
        int actual_sum=0;
        int max_element= Arrays.stream(list).max().getAsInt();
        int expected_sum= max_element*(max_element+1)/2;
        for(int i:list){
            actual_sum=actual_sum+i;
        }
        int missing_num= expected_sum-actual_sum;
        System.out.print("\nMissing Element: "+ missing_num);
    }
}
