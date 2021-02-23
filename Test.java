public class Test {
  // counts down form 10
    public static void main(String[] args) {
      // variable to start counting from
      int test = 1;
      // variable for num of times counted
      int count = 0;
      // loop to count down to 1
      while(test <= 100){
        System.out.println("test: " + test);
        test++;
        count++;
      }
      // print string for num of times counted
      System.out.println("Amount of numbers printed is: " + count);
    }
}
