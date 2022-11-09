/*=======================================================================

 Douglas Camero
 CSc 130
 Professor Cook
 Assignment 2

 Implement Radix sort using LinkedList and Node classes
 from last assignments

========================================================================= */
import java.io.File;
import java.util.Scanner;

//import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws Exception
    {  

        
        File file = new File("years.txt");
        Scanner sc = new Scanner(file);

        // read the number of passes needed for Radix Sort from file
        //Radixpasses = sc.nextInt();
           
        //sc.useDelimiter(",|\\n"); // used to read a line up to ',' and '\n'
        //sc.nextLine();

        //
        // Read the input file until the next line is 'END'
        // Created a new Entry and add to the tail of the LinkedList
        //
/*         while (!sc.hasNext("END"))
        {
            Entry item = new Entry();
            
            item.key = sc.next();
            item.value = sc.next();             
                      
        }   */      
        sc.close();
        
 


    }
}