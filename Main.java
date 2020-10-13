/**
 * method to print first digit of number
 * @author Darian
 */
public class Main {
  // method firstDigit to find first digit of num
  public static int firstDigit(int num){
    // repeat as long as num is 2 or more digits
    while (num > 10 || num < -10){
      // keep dividing num by 10
      num /= 10;
    }
    // this will return the first digit to the screen
    return num;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // store the method into a variable so it can be used
    int first = firstDigit(-979);
    // print the first digit to the screen
    System.out.println(first);
    
  }
}
