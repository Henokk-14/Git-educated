public class Test {
   // counts up form 1
    public static void main(String[] args) {
      // variable to start counting from
      int test = 1;
      // variable for num of times counted
      int count = 0;
      // loop to count up to 100
      while(test <= 100){
        System.out.println("test: " + test);
        test++;
        count++;
      }
      // print string for num of times counted
      System.out.println("Amount of numbers printed is: " + count);
    }
}
