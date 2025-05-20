import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case_Conversion {
    public static void main(String[] args) {
        /* using Inbuilt functions*/
        String str1= "RunwayYesDoIt";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
       
        /* without inbuilt functions */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the case to which tsring should be converted: \n 1. Uppercase- U \n 2. Lowercase- L\n");
            char caseType = scanner.next().charAt(0);
            List<Character> str_list = new ArrayList<>();
            StringBuilder str2= new StringBuilder();
            for(char ch: str1.toCharArray()){
                str_list.add(ch);
            }
            
            for(int i=0; i<str_list.size();i++){
                if(Character.toLowerCase(caseType)=='l'){
                    int ascii = (int) str_list.get(i);
                    if(ascii < 96){
                        ascii= ascii+ 32;
                    }
                    str_list.set(i,(char)ascii);
                    str2.append((char)ascii);

                }
                else if(Character.toLowerCase(caseType)=='u'){
                    int ascii = (int) str_list.get(i);
                    if(ascii > 96){
                        ascii= ascii- 32;
                    }
                    str_list.set(i,(char)ascii);
                    str2.append((char)ascii);
                }
            }
            System.out.println(str2);
        }
        
    }
}
