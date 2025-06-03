public class First_and_Last_Occurrence{
    public static void main(String[] args) {
        String s= "ff";
        int last=0, first=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== 'a'){
                if(i<first){
                    first=i;
                }
                if(i>last){
                    last=i;
                }
            }
        }
        if (first == Integer.MAX_VALUE) {
            System.out.print("Character 'a' is not present in the string.");
        } else {
            System.out.print("First Occurance is : " + first + " and last occurrance is : " + last);
        }
    }
}