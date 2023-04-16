
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        
    	File fle = new File("Testfile.txt");
        Scanner sc=new Scanner(fle);
        String A=sc.next();
        String B=sc.next();
        
       
        System.out.println(A.length()+B.length());
       
        if (A.charAt(0)>B.charAt(0)) 
        {
        	System.out.println("Yes");
        }else 
        {
        	System.out.println("No");
        }
       System.out.print(A.substring(0, 1).toUpperCase()+A.substring(1)+" ");
       System.out.println(B.substring(0, 1).toUpperCase()+B.substring(1));
    }
}



