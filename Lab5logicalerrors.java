
package lab5logicalerrors;

public class Lab5logicalerrors {

    public static void main(String[] args) {
       
        int a = 6, b = 10, c=35;
        System.out.println("Finding the largest number  \n");
    
    
  
        if ( a > b && a > c )
        System.out.println( a + "  is the largest Number ");
        else if ( b >  a && b > c)
            System.out.println( b + "  is the largest Number");
        
        
        else 
            System.out.println( c + " is the largest Number ");
        
    
    }
    
}
