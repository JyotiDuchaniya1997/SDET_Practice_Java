import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse_array {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(415, 45, 78, 78, 89, 45));
        List<Integer> reversed_list= new ArrayList<>();
        for( int i= list.size()-1;i>=0;i--){
            reversed_list.add(list.get(i));
        }
        System.out.println("reversed List"+ reversed_list);
    }
}
