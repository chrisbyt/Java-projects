import java.util.*;

public class Pascalstri
{
 public static void main(String[] args)
 {
  
     try{
     Scanner in = new Scanner(System.in);
     // display's pascal's triangle based on user input

  System.out.print("Display pascal's triangle up to this number:(max 20): ");
  
  
  int number = in.nextInt();
  

  
  pascal(number,0);
  
 
  
 }
     catch (Exception ex)
     {
      System.out.println(ex.getMessage());
      System.out.println(ex);
      
     }
}
 
private static long fact (long n, long num)
{
 if (n == 0)
    return num;
else
    return  fact(n-1, n*num);
}

private static long comb (long n, long r)
{ 
    return fact(n,1) / ( fact(n-r,1) * fact(r,1));
}
 
 
 private static void pascal (long num, long first)
    {
     if (num == 0)
       {
      System.out.print(1); }
    
    else if (first == num)
    {
        pascal(num-1,  0);
        
        System.out.println();
    System.out.print( comb(num, first ) + " " );
    }
     
     else
     {
         pascal(num, first+1);
      System.out.print( comb(num,first)+ " ");
     
      
     }
     
 }
 
}




   



   
