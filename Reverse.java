import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        String s= "Lets do it today";
        /* reverse whole array without changing indexes*/
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        /*reverse as per space only*/
        System.out.println("***");
        String[] x= s.split(" ");
        for(int i=x.length-1; i>=0;i--){
            System.out.print(x[i]+" ");            
        }
        /* reverse whole array with changing indexes*/
        System.out.println("***");
        List<Character> charList = Arrays.asList(new Character[s.length()]);
        for (int i = 0; i < s.length(); i++) {
            charList.set(i, s.charAt(i)); 
        }
        int left=0;
        int right= charList.size()-1;
        char ch;
        while(left<right){
            ch = charList.get(left);
            charList.set(left, charList.get(right)); 
            charList.set(right, ch);
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : charList) {
            sb.append(c);
        }

        String s1 = sb.toString();
        System.out.println(s1);
    }
}
