public class Pallindrome {
    public static void main(String[] args) {
        String str="dxfghj";
        boolean ispalin=true;
        int last= str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!= str.charAt(last)){
                ispalin=false;
                break;
            }
            last--;
        }
        if(ispalin){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
        
    }
}
