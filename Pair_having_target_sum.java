public class Pair_having_target_sum {
    public static void main(String[] args) {
        int target_sum=12;
        int[] list1= {1,2,5,7,3,6,4,6,6};
        for(int i=0;i<list1.length-1;i++){
            if((list1[i] + list1[i+1])== target_sum ){
                System.out.println("The pair having desired sum is ("+list1[i]+","+list1[i+1]+").");
            }
        }
    }
}
