public class Test {
  // counts down form 10
    public static void main(String[] args) {
      int test = 100;
      int count = 0;
      while(test >= 1){
        System.out.println("Count: " + test);
        test--;
        count++;
      }
      System.out.println("Amount of numbers printed is: " + count);
    }
}
