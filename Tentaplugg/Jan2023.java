public class Jan2023 {
    
}

//2
public static Int maxInt(Int[] v)
{
    Int max = v[0];
    for(int i = 1; i < v.length; i++)
    {
        if(max.lessThan(v[i]))
        {
            max = v[i];
        }
    }
    return max;
}

public static Int[] positiveInts(Int[] v)
{
    int size = 0;
    for(int i = 0; i < v.length; i++)
    {
        if((!v[i].lessThan(ONE)))
        {
            size++;
        }
    }
    Int[] positives = new Int[size];

    for(int i = 0, j = 0; i < v.length; i++)
    {
        if((!v[i].lessThan(ONE)))
        {
            positives[j++] = v[i];
        }
    }
    return positives;
}

Int[] vector = {new Int(1), 
                new Int(-2), 
                new Int(4), 
                new Int(-44), 
                new Int(0)};

Int max = maxInt(vector);
Int[] positives = positiveInts(vector);

// 3
public Word subWord(int fromIndex, int toIndex)
{
    if(fromIndex > toIndex)
        throw new IllegalArgumentException();
    if(fromIndex < 0 || toIndex >= chars.length)
        throw new IndexOutOfBoundsException();

    char[] newChars = new char[toIndex - fromIndex + 1];
    for(int i = fromIndex, j = 0; i <= toIndex; i++)
    {
        newChars[j++] = chars[i];
    }

    return new Word(newChars);
}

public void addFirst(char c)
{
    char[] newChars = new char[chars.length+ 1];
    newChars[0] = c;
    for(int i = 0, j = 1; i < chars.length; i++)
    {
        newChars[j++] = chars[i];
    }
    chars = newChars;
}

//4
interface ComparableObject<T>
{
// compareTo returnerar -1 om objektet är mindre än det givna objektet,
// 0 om objektet är lika med det givna objektet,
// och 1 om objektet är större än det givna objektet.
    int compareTo (T object);
}

class Point implements ComparableObject<Point>
{
    private double x;
    private double y;
    
    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double distance ()
    {
        return Math.sqrt (x * x + y * y);
    }

    // koden saknas här
    public int compareTo(Point p)
    {
        int comp;
        if(this.distance() < p.distance())
            comp = -1;
        else if(this.distance() == p.distance())
            comp = 0;
        else 
            comp = 1;
        
        return comp;
    }
}

public static <T extends ComparableObject<T>> T max (T[] objects)
{
    T max = objects[0];
    for(int i = 0; i < objects.length; i++)
    {
        if(objects[i].compareTo(max) > 0)
            max = objects[i];
    }
    return max;
}
Point[] p = {  new Point(2, 2), 
                    new Point(3, 3), 
                    new Point(4, 4), 
                    new Point(1, 1)};
Point m = max(p);
