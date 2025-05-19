public class String_length_without_Inbuilt_length {
    public static void main(String[] args) {
        String s= "fgcdhsjkhjryebdjshdy";
        int length=0;
        try{
            while(true){
                s.charAt(length);
                length++;
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(" End of string");
        }
        System.out.println("The length of the string is "+length);
    }
}
