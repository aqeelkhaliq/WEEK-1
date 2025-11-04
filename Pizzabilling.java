package P23;
import java.util.Scanner;
public class Pizzabilling{
    public static void main(String[]args){
        
        Scanner scanner=new Scanner(System.in);
        
        
        System.out.println("Enter pizza size(small,medium,large): ");
        String size=scanner.nextLine().toLowerCase();
        
        int baseprice=0;
        switch(size){
            case"small":
               baseprice=100;
               break;
               
               case"medium":
               baseprice=200;
               break;
               
               
               case"large":
               baseprice=300;
               break;
               
               default:
                   System.out.println("invlaid selected!");
                   scanner.close();
                   return;
        }
        
        System.out.println("Do you want peporoni(yes/no): ");
        String peporoni=scanner.nextLine().toLowerCase();
        
        System.out.println("do you want cheese(yes/no)");
        String cheese=scanner.nextLine().toLowerCase();
        
        
        // Add pepperoni cost
        if (peporoni.equals("yes")) {
            if (size.equals("small")) baseprice += 30;
            else baseprice += 50;
        }
        
        // Add cheese cost
        if (cheese.equals("yes")) baseprice += 20;
        
        // Display bill
        System.out.println("Your final bill is: " + baseprice + " rupees");
        
        scanner.close();
    }}

      
    
