public class Node
{
    public Entry value;
    public Node left;
    public Node right;

    Node()
    {
        value = null;
        right = null;
        left = null;
    }

    Node(Entry entry)
    {
        value = entry;
        value.key = 0;// hard coded for now, to reduce errors
        

    }

    void print(int indent)
    {

    }

    void add(Entry entry)
    {

    }

    String find(int key)
    {
        return null;
    }

}
