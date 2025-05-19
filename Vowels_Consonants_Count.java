import java.util.Arrays;
import java.util.List;

class Vowels_Consonants_count {
     public static void main(String[] args) {
       String str="hello lets do it today. I will be consistent";
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int vow=0;
        int conso=0;
        for(int i=0; i<str.length();i++){
            if(vowels.contains(Character.toLowerCase(str.charAt(i)))){
                vow++;
            }
            else{
                if(Character.isLetter(str.charAt(i))){
                    conso++;
                }
            }
        }
        System.out.println(vow+ "  " + conso);
    }
}