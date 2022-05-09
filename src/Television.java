// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_4_1
// File Name: Television.java

// This program makes the concept of a television with the following attributes:
// Price, brand, screen size
// It does this using a constructor, accessors, mutators, and a toString method
// It passes this information on to the class MyTelevisions: 
// SEE MyTelevisions.java

// Still need to test and fix for the objects or instantiation and output issue

public class Television
{   
    
    // Variables I used for this program
    private int price;
    private String brand;
    private int screenSize; 
    
    // Constructor for all of the variables, sets the default values
    public Television(){
        price = 0;
        brand = "";
        screenSize = 0;
    }
    
    // Mutator for price
    public void setPrice(int sPrice)
    {
        price = sPrice;
    }
        
    // Mutator for brand
    public void setBrand(String sBrand)
    {
        brand = sBrand;
    }
    
    // Mutator for screen size
    public void setScreenSize(int sScreenSize)
    {
        screenSize = sScreenSize;
    }
    
    // Accessor for price
    public int getPrice()
    {
        return price;
    }
    
    // Accessor for brand
    public String getBrand()
    {
        return brand;
    }
    
    // Accessor for screen size
    public int getScreenSize()
    {
        return screenSize;
    }
    
    // toString method that outputs everything at once
    @Override
    public String toString()
    {
        String toPrint = new String();
        toPrint += "\n" + "Price: $" + price + "\n" + "Brand: " + brand
        + "\n" + "Screen Size: " + screenSize + " inches";
        return toPrint;
    }
}
