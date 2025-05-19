import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_duplicates_Array {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>(Arrays.asList(1,4,5,6,7,8,9,5,3,1,4,7,9,7,4,35));
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        List<Integer> uniqueList = new ArrayList<>(uniqueNumbers);
        System.out.println("Original List: " + numbers);
        System.out.println("List after removing duplicates: " + uniqueList);

        /* without using set  */
        /* without using set  */
List<Integer> new_numbers= new ArrayList<>(Arrays.asList(1,4,5,6,7,8,9,5,3,1,4,7,9,7,4,35));
List<Integer> newList= new ArrayList<>();
for (Integer num : new_numbers) {
    if (!newList.contains(num)) {
        newList.add(num);
    }
}
System.out.println("Original List: " + new_numbers);   
System.out.println("List after removing duplicates: " + newList);
    }
}
