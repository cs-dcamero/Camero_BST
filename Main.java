/*=======================================================================

 Douglas Camero
 CSc 130
 Professor Cook
 Assignment 3

Binary Search Tree

========================================================================= */
import java.io.File;
import java.util.Scanner;

//import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws Exception
    {  
        
        
        File file = new File("halloween calories.txt");
        Scanner sc = new Scanner(file);
        
        // read the number of passes needed for Radix Sort from file
        int width;
        width = sc.nextInt();
        
        String str;
        //sc.useDelimiter(",|\\n"); // used to read a line up to ',' and '\n'
        sc.nextLine();
       
        BinarySearchTree BST = new BinarySearchTree();

        // Read the input file until the next line is 'END'
        // Created a new Entry and add to the tail of the LinkedList
        //
        while (!sc.hasNext("END"))
        {
            str = sc.nextLine();
            
            Entry item = new Entry();
            
            item.key = Integer.valueOf(str.substring(0,width));
            item.value = str.substring(width + 1);
            
            BST.add(item);
        }        
        sc.close();
        
        System.out.println(BST.About());

        BST.Print();

        System.out.println(BST.find(100));
        


    }
}