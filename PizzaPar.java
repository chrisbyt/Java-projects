
import java.util.Scanner;

public class PizzaPar
{
    public static void main (String []args)
        
    {
        String msg; Pizza sample;int x;
        Scanner keysIn = new Scanner(System.in);
        
        System.out.println("How many pizza ");
        
        int p = keysIn.nextInt();
        Pizza[] order = new Pizza[p];
        
        for (int i = 1; i <= p; i++)
        {
          
          System.out.println("choose pizza type");
          for (int j = 1; j<= 4; j++)   
          {
              sample = new Pizza(j);
              msg = String.format ("%d. %s\t $%4.2f",j,sample.getType(),sample.getCost() );
             System.out.println(msg);
             }
            x = keysIn.nextInt();
            order[i-1] = new Pizza(x);
            msg = String.format("%s costs $%4.2f", order[i-1].getType(), order[i-1].getCost());
            System.out.println(msg);
            
            System.out.println("choose # of toppings:");
            x = keysIn.nextInt();
            
            if (x> 0)
            {
            for (int k = 1; k <= x ; k++)
            {
                System.out.println("Enter topping "+ k);
                msg = keysIn.next();  
                order[i-1].addTopping(msg);
                
            }
            }
            
            }




            System.out.println("You ordered: ");
             double total = 0;
            
            for (int y = 0; y< order.length; y++)
            {
                System.out.println(order[y].toString());
                total+= order[y].getCost();
            }
            
            System.out.println("Your total is " + total);
            





        
        
            
            
            
        
            
            
    
    }
}    
