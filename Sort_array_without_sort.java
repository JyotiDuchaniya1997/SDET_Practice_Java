import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_array_without_sort {
    public static void main(String[] args) {
        {
            List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(12, 3, 6, 84, 2, 4, 54));
            for(int i=0;i<list1.size();i++){
                for(int j=i+1;j<list1.size();j++){
                    if(list1.get(j)<list1.get(i)){
                        int c = list1.get(i);
                        list1.set(i, list1.get(j));
                        list1.set(j, c);
                    }
                }
            }
            System.out.println(list1);
        }
    }
}
