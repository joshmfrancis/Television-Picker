// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_4_1
// File Name: MyTelevision.java


// This is a driver class for the Television class where it reads information 
// about the three televisions from the user (using the Scanner class),
// test each of the methods in the Television class, and instantiates and prints 
// three Television objects

// Still need to test and fix for the objects or instantiation and output issue

// Import I used
import java.util.Scanner;

// Driver Class
public class MyTelevisions 
{
    
    public static void main(String[] args) 
    {
    //Variables I used in this class
    Television television0, television1, television2, television3;
    
    // Creates the consumed variable for the String inputs
    String consumer;
    
    //Creates the television objects
    television0 = new Television();
    television1 = new Television();
    television2 = new Television();
    television3 = new Television();
    
    // The code below tests the 'get' and 'set' modifiers, 
    // and also tests the toString method.
    // Meaning, all of the methods are tested:
    // see comments to see where they are tested 
    
    // Creates new scanner for input 
    Scanner scan = new Scanner(System.in);
    
    
    // Television 1
    // You can input only as an integer
    System.out.print("Enter the price of the television #1 (no decimal): ");
    // Tests getter method for price
    television1.setPrice(scan.nextInt());
    
    System.out.print("Enter the brand of the television #1: ");
    consumer = scan.nextLine(); // Consumes "\n"
    // Tests getter method for brand
    television1.setBrand(scan.nextLine());
    
    // You can input only as an integer
    System.out.print("Enter the screen size of the television #1 "
    + "(in inches)(no decimal): ");
    // Tests getter method for Screen Size
    television1.setScreenSize(scan.nextInt());
    System.out.println(); // Creates space in output
    
    // Television 2
    // You can input only as an integer
    System.out.print("Enter the price of the television #2 (no decimal): ");
    television2.setPrice(scan.nextInt());
    
    System.out.print("Enter the brand of the television #2: ");
    consumer = scan.nextLine(); // Consumes "\n"
    television2.setBrand(scan.nextLine());
    
    // You can input only as an integer
    System.out.print("Enter the screen size of the television #2 "
    + "(in inches)(no decimal): ");
    television2.setScreenSize(scan.nextInt());
    System.out.println(); // Creates space in output
    
    // Television 3
    // You can input only as an integer
    System.out.print("Enter the price of the television #3 (no decimal): ");
    television3.setPrice(scan.nextInt());
    
    System.out.print("Enter the brand of the television #3: ");
    consumer = scan.nextLine(); // Consumes "\n"
    television3.setBrand(scan.nextLine());
    
    // You can input only as an integer
    System.out.print("Enter the screen size of the television #3 "
    + "(in inches)(no decimal): ");
    television3.setScreenSize(scan.nextInt());
    System.out.println(); // Creates space in output
    
    // Television 0
    // Tests the 'constructor' and 'getter' methods of the class Television
    // It is the default 'get' and 'constructor' variable pointers
    // AUTOMATICALLY TESTED AT END OF OUTPUT 
    
    // Tests getter method for price, brand, and screen size
    // price = 0, brand = "", screenSize = 0
    String test =  "\nPrice: " + television0.getPrice() + "\nBrand:" + 
    television0.getBrand() + "\nScreen Size: " + television0.getScreenSize();
    
    
    // Tests the toString method
    System.out.println("Televisions you picked: \n\n" + "Television #1: " + 
    television1 + "\n\n"+ "Television #2:" + television2 + "\n\n"+ 
    "Television #3: " + television3 + "\n\n"+ "Television #0: " + test);
    }
    
}