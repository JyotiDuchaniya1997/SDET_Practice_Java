import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Check_sorted {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        boolean sorted= true;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the sorting order to check: \n 1. Descending- D \n 2. Ascending- A");
            char order = scanner.next().charAt(0);
            for (int i = 1; i < list.size(); i++) {
                if (Character.toLowerCase(order) == 'd') {
                    if (list.get(i) > list.get(i - 1)) {
                        sorted = false;
                        break;
                    }
                } else if (Character.toLowerCase(order) == 'a') {
                    if (list.get(i) < list.get(i - 1)) {
                        sorted = false;
                        break;
                    }
                }
            }
            if(sorted){
                System.out.println("Sorted");
            }
            else{
                System.out.println("Not Sorted");
            }
        }
    }
}
