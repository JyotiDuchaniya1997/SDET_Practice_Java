import java.util.HashMap;

public class Char_single_occurance {
    public static void main(String[] args) {
        String s ="Hello guys. Lets do it";
        HashMap<Character, Integer> occurance= new HashMap<>();     
        for(int i=0;i<s.length();i++){
            if(occurance.containsKey(s.charAt(i))){
                occurance.put(s.charAt(i), occurance.get(s.charAt(i))+1);
            }
            else{
                occurance.put(s.charAt(i), 1);
            }
        }
        for(int j=0;j<s.length();j++){
            if(occurance.get(s.charAt(j))==1){
                System.out.println("The first character having single occurance is "+s.charAt(j));
                break;
            }
        }
    }
}
