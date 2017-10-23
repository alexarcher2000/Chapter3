package Chapter3;

import java.util.Scanner;
import java.text.NumberFormat;
 
public class Charge
{
   public static void main (String[] args)
   {
           double previousBalance;  // employee's current  salary
           double interest = 0;              // amount of the raise
           double newBalance = 0;          // new salary for the employee
           double charges;
           double minPayment = 0;
           double totalcharges;
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter previous balence: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the total ammount of charges: ");
           charges = scan.nextDouble();
           
           interest = (previousBalance + charges) * 0.02;
           newBalance = (previousBalance + charges) * 1.02;
           if (newBalance < 50){
               minPayment = newBalance;
           }
           
           if (newBalance >= 50 && newBalance <= 300){
               minPayment = 50;
            }
            
           if (newBalance > 300){
               minPayment = (.2 * newBalance);
            }
           
 
          
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println();
           System.out.println("Previous Balance:           $" + previousBalance);
           System.out.println("Additional Charges:         $" + charges);
           System.out.println("Interest:                   $" + interest);
           System.out.println();
           System.out.println("New Balance:                $" + newBalance);
           System.out.println();
           System.out.println("Minimum Payment:            $" + minPayment);
           
        }
}