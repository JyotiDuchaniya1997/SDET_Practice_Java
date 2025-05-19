import java.util.HashMap;

public class Character_Occurance {
    public static void main(String[] args) {
        String str= "Lets count the number of characters in this. We will use Hashmap for this";
        HashMap <Character, Integer> occurance= new HashMap<>();
        int new_val;
        for(int i=0; i<str.length();i++){
            if(occurance.containsKey(str.charAt(i))){ 
                System.out.println(str.charAt(i));
                new_val= occurance.get(str.charAt(i))+1;
                occurance.put(str.charAt(i),new_val );
            }
            else{
                occurance.put(str.charAt(i),1 );
            }
        }
        for(Character key: occurance.keySet()){
            int value= occurance.get(key);
            System.out.println("Occurance of '"+ key + "' is "+ value);
        }
    }
}
