public class Swap_2_num {
    public static void main(String[] args) {
       int x=56;
        int y=65;
        /* without using new variable*/
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print("x is "+x+" And y is "+y);
        /* with using new variable*/
        int z;
        z=x;
        x=y;
        y=z;
        System.out.print("\nx is "+x+" And y is "+y);
        /*Using XOR*/
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.print("\nx is "+x+" And y is "+y);
    }
}
