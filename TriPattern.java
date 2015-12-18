

public class TriPattern
{
    public static void main (String []args)
        
    {
       java.util.Scanner input = new  java.util.Scanner(System.in);
        
        //String s = input.nextLine();
      //  revString(s);
        
        try
        {
        int x = 0; String a;
        char ans = 'Y';
        
        
        
        while (ans == 'Y')
            
        {
            x = 0;
        
           System.out.println("Enter an odd number"); 
           x= input.nextInt();
           
           if (x%2 == 0)
           {
               throw new IllegalArgumentException("Cannot enter even");
               
           }
             
                   
        makepattern(x);
        
        System.out.println("Play again?");
        a = input.next();
        a = a.toUpperCase();
        
        
        ans = a.charAt(0);
        
        }
        }
        
        catch (Exception ex)
        {
         System.out.println(ex);   
            
        }
            
        
        
        
 
        
        
       
    }
    
    public static void makepattern(int x)
    {
        String s;
     
        for (int i = 0; i< x; i++)
        {
            
            s = "";
            
            for (int k = 0; k < x- i; k++)
            {
             
             s = s+ " ";   
                
            }
            
                
                
            for (int j = 0; j <= i; j++)
            {   s = s+ "*";
                
            }
            
            System.out.println(s);
        }
        
        
    }
