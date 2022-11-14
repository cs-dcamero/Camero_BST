class BinarySearchTree
{
    private Node root;


    BinarySearchTree()
    {
        root = null;
    }
    public String About()
    {
        String about;
        about = "===================================================================\n";
        about += "Author: Douglas Camero\nThis is my best attempt at implementing a BST :)\n";
        about += "===================================================================\n";
        return about;
    }

    void Print()
    {
        //System.out.println("BST line 21");
        
        
            root.Print(0);
        
        
    }

    void add(Entry entry)
    {
        //System.out.println(entry.key +" " + entry.value);    
       // System.out.println("BST line 32");
        if(root == null)
        {                              
            root = new Node(entry);
        }
        else
        {
            root.add(entry);
        }          
    }

    String find(int key)
    {
        if(root != null)
        {
            return root.find(key);
        }
        return " ";
    }

}