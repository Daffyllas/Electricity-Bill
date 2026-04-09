
package project2coursework;
import java.util.Scanner;

public class Project2Coursework {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        double typePricing;
        double totalPrice;
        System.out.println("---------------------------------------------------");
        System.out.println("====== Electricity Calculator ======");
        System.out.println(" ");
        System.out.println("Pricing : 1)   0 - 250: 0.10/kWh");
        System.out.println ( "                   251 - 500: 0.12/kWh");
        System.out.println("                   500+ - 0.15/kWh");
        
        
        System.out.println("---------------------------------------------------");
        
        
      while (true)
      {
       System.out.println("Input how much Kw of electricity you consumed ");
     
      if (scanner.hasNextDouble())
      {
       double input = scanner.nextDouble();
       if (input <= 0)
      {
      System.out.println("Kw cannot be negative number or 0 ");
      
      
      }   
       if (input > 0 && input <= 250)
       {
         typePricing =  type();
           
           
           
           totalPrice = input * 0.1 + typePricing;
           System.out.println("Fixed expenses =  "+typePricing);
           System.out.println("Scale 1 pricing =  "+input * 0.1);
       System.out.println("The total price of your bill is "+totalPrice);
       break;
       
       }
       
      else if (input > 250 && input <= 500)
       {
       
        typePricing =  type();
           
           
         
           totalPrice = (input - 250) * 0.12 + (250*0.1) + typePricing;
       System.out.println("Fixed expenses =  "+typePricing);
       System.out.println("Scale 1 pricing = "+250 * 0.1);
       System.out.println("Scale 2 pricing =  "+(input - 250)*0.12);
       System.out.println("The total price of your bill is "+totalPrice);
       break;
       
       }
        else if (input > 500 )
        {
         typePricing =  type();
           
           
          
           totalPrice = (input - 500)*0.15 + typePricing + 250 * 0.1 +250 * 0.12;
       System.out.println("Fixed expenses =  "+typePricing);
       System.out.println("Scale 1 pricing = "+250 * 0.1);
       System.out.println("Scale 2 pricing = "+250*0.12);
       System.out.println("Scale 3 pricing =  "+(input - 500)*0.15);
       System.out.println("The total price of your bill is "+totalPrice);
       break;
        
        }
       
       
       
      }
      
      else 
      {
       System.out.println("Wrong input,try again");
      scanner.next();
      }
      
      
      
      
      
      }
      
        
        
        
        
        
        
     
        
        
        
        
        
    }
       public static int type()
        {while (true)
        {
            Scanner scanner1 = new Scanner(System.in);
        System.out.println("Press 1 or 2 (1 for residential/2 for commercial) ");
          if (scanner1.hasNextInt())
          {
            int  type = scanner1.nextInt();
           if (type == 1)
           {
           return 5;
           
           }
           else if (type == 2)
           {
           return 12;
           
           }
           
           
        }
          else 
          {
         System.out.println("Wrong input ") ;
         scanner1.next();
          
         }
        }
        }
       
        
    
}
