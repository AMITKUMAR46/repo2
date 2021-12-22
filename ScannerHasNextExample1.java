import java.util.*;  
public class ScannerHasNextExample1 {    
    public static void main(String args[]){       
          //Create Scanner object
System.out.println("Enter the String");  
Scanner sc=new Scanner(System.in);
//String scanned=sc.nextLine();
boolean state=true;
        Scanner scan = new Scanner(System.in).useDelimiter("\\s*,\\s*");  
        //Printing the delimiter used  

        System.out.println("Delimiter:" + scan.delimiter());  
        //Print the Strings  
        while (scan.hasNext()) {  
            System.out.println(scan.next());  

        }  
        //Close the scanner  
        scan.close();  
        }    
} 