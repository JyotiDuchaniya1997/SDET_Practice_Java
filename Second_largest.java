import java.util.Arrays;

public class Second_largest {
    public static void main(String[] args) {
        int[] list = {1,2,4,5,67,8,6,4};
        int[] list1 = {1,2,4,5,67,8,6,4};
        /* using Inbuilt functions */
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("The second largest number of list is = " + list[list.length-2]);

        /*without using inbuilt functions */
        int maxi=list1[0], sec_max=list1[0];
        for( int i =0; i<list1.length; i++){
            if(list1[i]>maxi)
            {
                sec_max=maxi;
                maxi=list1[i];
            }
            else if (list1[i] > sec_max && list1[i] != maxi) {
                sec_max = list1[i];
            }
        }
        System.out.print(sec_max);
    }
}
