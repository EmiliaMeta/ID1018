/* */
// Uppgift 2
class IntUtil
{
    public static Int[] absInts(Int[] v)
    {
        Int[] absolutes = new Int[v.length];
        for(int i = 0; i < v.length; i++)
        {
            absolutes[i] = v[i].abs();
        }
        return absolutes;
    }

    public static Int[] oddInts(Int[] v)
    {
        int size = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(!v[i].isEven())
                size++;
        }
        
        Int[] odds = new Int[size];
        int index = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(!(v[i].isEven()))
            {
                odds[index] = v[i];
                index++;
            }
        }
        return odds;
    }
}

Int[] vector = {new Int(1),
                new Int(2),
                new Int(3),
                new Int(4),
                new Int(5)};

Int[] absolutes = IntUtil.absInts(vector);
Int[] odds = IntUtil.oddInts(vector);

//Upggift 3
public void addLast(Object obj)
{
    Object[] temp = new Object[objects.length + 1];
    for(int i = 0; i < objects.length; i++)
        temp[i] = objects[i];
    temp[objects.length] = obj;
    objects = temp;
}

public ArrayList subList(int fromIndex) throws IndexOutOfBoundsException
{
    if(fromIndex < 0 || fromIndex >= objects.length) 
        throw new IndexOutOfBoundsException("Index out of range.\n");
    
    Object[] newList = new Object[objects.length - fromIndex];
    int index = 0;
    for(int i = fromIndex; i < objects.length; i++)
    {
        newList[index] = objects[i];
        index++;
    }
    return new ArrayList(newList);
}

//Uppgift 4



