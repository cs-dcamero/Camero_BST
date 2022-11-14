public class Entry
{
    public int key;
    public String value;

    Entry()
    {
        key = 0; // what is used to sort
        value = null; // what is stored at the key
    }
    
    Entry(Entry data)
    {
        key = data.key;
        value = data.value;
    }

}
