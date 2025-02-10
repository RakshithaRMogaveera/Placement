import java.util.Scanner;

public class reverse {
        public static void main (String[]args){
            Scanner rs= new Scanner(System.in);
            System.out.println("Enter the string ");
            String revstrng= rs.nextLine();
            System.out.println("Reversed string is "+ new StringBuilder(revstrng).reverse());  
            rs.close();
        }
        
    }
  
