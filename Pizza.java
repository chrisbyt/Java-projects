import java.util.*;

/*Name:  Boyang Tan
 Assignment:  Assignment 1
 Program: Computer Systems Technology NE
 
 This Program print out some imformation about me
 */

public class Pizza
{  
    
    
    private String type;
    private String[] toppings = new String[10];
    private double cost;
    
    
    
    public Pizza(int num)
    {
        switch (num)
        {
            case 1: 
                
            {
                type = "pepperoni";
                cost = 4.5;
                
            } 
            break;
            case 2: 
            {
                type = "Cheese";
                cost = 4;
                
            }
            break;
            case 3: 
            {
                type = "Hawaiian";
                cost = 4.75;
                
            }
            break;
            case 4: 
            {
                type = "Canadian";
                cost = 5.50;
                
            }
            break;
            
        }
    }
    
    public String getType()
    {
        return type;
    }
    
    public double getCost()
    {
        return cost;
    }
        
    
    public void addTopping(String t)
        
    {
        int i = 0;
        while (toppings[i] != null)
        {
            i++;
        }
        
        toppings [i] = t;
        
        
        
    }
    
    
    public String toString()
    {
        String r = "";
        int i = 0;
            while (toppings[i] != null)
            { r = r +" " + toppings[i];
                i++;
            }
            
         if (i== 0)
             r = " no toppings";
            
            
        
        String d = type + " with" + r + "cost " + cost;
        
        return d;
    }
    
    
}
    
    
    
    
    
    
