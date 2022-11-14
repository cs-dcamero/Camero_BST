public class Node
{
    Entry value;
    Node left;
    Node right;

    Node()
    {
        value = null;
        left = null;
        right = null;
    }   

    Node(Entry entry)
    {
        value = entry;
        left = null; 
        right = null;    
    }

    void Print(int indent)
    {
       // System.out.println("line 22");
        for(int i = 0; i < indent; i++)
        {
            System.out.print("   ");
        }

        System.out.print("+--- ");
        System.out.println(value.key + ": " + value.value);

        if(left != null)
        {
            left.Print(indent + 1);
        }
        if(right != null)
        {
            right.Print(indent + 1);
        }
    }

    void add(Entry entry)
    {
        //System.out.println("Node line 37");
        if(entry.key < value.key)
        {
            if(left != null)
            {
                left.add(entry);
            }
            else
            {
                Node leftChild = new Node(entry);
                left = leftChild;
            }
        }

        if(entry.key > value.key)
        {
            if(right != null)
            {
                right.add(entry);
            }
            else
            {
                Node rightChild = new Node(entry);
                right = rightChild;
            }
        }
    }

    String find(int key)
    {
        if(key < value.key && left != null)
        {
            return left.find(key);
        }
        if(key > value.key && right != null)
        {
            return right.find(key);
        }
        if(key == value.key)
        {
            return value.value;
        }
        return "\n============ KEY NOT FOUND ===========\n\n";
    }

}
