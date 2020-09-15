import java.util.Scanner;

/**
 * Asks for two numbers then divides and shows * * quotent and remainder
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    //Asks user for two numbers on seperate lines
    System.out.println("Please enter in two integers, on seperate lines, to divide.");

    //Declare variable for first number
    int firstNum;

    //Declare variable for second number
    int secondNum;

    //records users first number
    firstNum = input.nextInt();

    //records users second number
    secondNum = input.nextInt();

    //Calculates quotent
    int quo = firstNum / secondNum;

    //Calculates remainder
    int rem = firstNum % secondNum;

    //Tells user the quotent and remainder of their two numers
    System.out.println(firstNum + "/" + secondNum + " is " + quo + "  with a remainder of " + rem + ".");




    
    
  }
}
