public class Odd_Even_elements {
    public static void main(String[] args) {
      String[] str= {"Java", "Selenium", "TestNG", "Maven", "Jenkins","Docker"};
      System.out.print("Even Indexes Elements: ");
      for(int i=0; i<str.length;i+=2){
        System.out.print(str[i]+", ");
      }
      System.out.print("\nOdd Indexes Elements: ");
      for(int i=1; i<str.length;i+=2){
        System.out.print(str[i]+", ");
      }
    }
}
