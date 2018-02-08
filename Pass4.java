import java.util.Scanner; //import the Scanner class

public class WilkersonPass4
{
  static public void main(String [] args)
  {
   
    //Create the Scanner object keyboard to read the input
    Scanner keyboard = new Scanner(System.in);
    
    //Create the variables for package prices and extra hours pricing
    final double packageA = 9.95, packageB = 13.95, packageC = 19.95, packageAExtraHours = 2.00, packageBExtraHours = 1.00;
     
    System.out.println("Enter the customer's pacakge (A, B, or C): ");
    char customerPackage = keyboard.nextChar();
    
    
