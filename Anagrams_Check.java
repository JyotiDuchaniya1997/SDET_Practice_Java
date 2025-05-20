import java.util.Arrays;

public class Anagrams_Check {
    public static void main(String[] args) {
        String str1= "fd";
        String str2= "integral";
        if(str1.length()!= str2.length()){
            System.out.println("Both strings are not Anagrams");
        }
        else{
            char[] str1_array= str1.toCharArray();
            char[] str2_array= str2.toCharArray();
            Arrays.sort(str1_array);
            Arrays.sort(str2_array);
            String str1_sorted= new String(str1_array);
            String str2_sorted= new String(str2_array);
            System.out.print(str2_sorted+ "  "+ str1_sorted+"\n");
            if(str1_sorted.equals(str2_sorted)){
                System.out.println("Both strings are Anagrams");
            }
            else{
                System.out.println("Both strings are not Anagrams");
            }
        }
    }     
}