/* 
//Uppgift 1
class Arrays
{
    public static void main (String[] args)
    {
        int[] p = {5, 4, 3, 2, 1};
        int[][] q = {   {0, 0, 0, 1},
                        {0, 0, 1, 0},
                        {0, 1, 0, 0},
                        {1, 0, 0, 0} };
        int[] u = handle(p);
        int[][] v = handle(q);
    }
   
    public static int[] handle (int[] a)
    {
        int k = 0;
        for (int i = a.length - 1; i > 0; i--)
            if (a[i] < a[i - 1])
            {
                k = a[i];
                a[i] = a[i - 1];
                a[i - 1] = k;
            }
        
        return a;
    }
    public static int[][] handle (int[][] a)
    {
        int[][] b = new int[a.length][];
        
        for (int i = 0; i < b.length; i++)
            b[i] = a[a.length - 1 - i];
        
        return b;
    }
}


//Uppgift 2
class Int
{
    private int value;

    public Int (int value)
    {
        this.value = value;
    }

    public boolean isEven ()
    {
        return value % 2 == 0;
    }

    public boolean lessThan (Int n)
    {
        return this.value < n.value;
    }
}

class IntUtil
{
    //a)
    public static Int[] evenInts(Int[] v)
    {
        int size = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].isEven())
            {
                size++;
            }
        }
        Int[] even = new Int[size];
        int index = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].isEven())
            {
                even[index] = v[i];
                index++;
            }
        }
        return even;
    }

    //b)
    public static Int minEvenInt (Int[] v)
    {
        
        Int[] evenInts = evenInts(v);
        
        if(evenInts.length == 0)
            return null;
        else
        {
            Int minEven = evenInts[0];
            for(int i = 0; i < evenInts.length; i++)
            {
                if(evenInts[i].lessThan(minEven))
                {
                    minEven = evenInts[i];
                }
            }
            return minEven;
        }
    }
}

//c)
Int[] vector =  {new Int(1), 
                new Int(3), 
                new Int(45), 
                new Int(55), 
                new Int(16)};

Int[] evenInts = IntUtil.evenInts(vector);
Int minEven = IntUtil.minEvenInt(vector);


//Uppgift 3
class ArrayList
{
    // objekt i listan
    private Object[] objects;
    
    public ArrayList (Object[] objects)
    {
        this.objects = new Object[objects.length];
        for (int i = 0; i < objects.length; i++)
        this.objects[i] = objects[i];
    }
    
    public String toString ()
    {
        String s = "[";
        
        if (objects.length > 0)
        {
            for (int i = 0; i < objects.length - 1; i++)
            s += objects[i] + ", ";
            s += objects[objects.length - 1];
        }
        s += "]";
        
        return s;
    }
    // addFirst lägger till ett givet objekt i början av listan.
    public void addFirst (Object obj)
    {
        // koden saknas här
        Object[] temp = new Object[objects.length + 1];
        temp[0] = obj;
        for(int i = 0; i < objects.length; i++)
        {
            temp[i+1] = objects[i];
        }
        objects = temp;
    }
   
    // indexOf returnerar indexet av den första förekomsten av ett givet objekt i listan.
    // Om objektet inte finns, returneras -1.
    // Anta att null inte förekommer i listan.
    public int indexOf (Object obj)
    {
        // koden saknas här
        int index = -1;
        for(int i = 0; i < objects.length; i++)
        {
            if(obj.equals(objects[i]))
            {
                index = i;
                return index;
            }
        }
        return index;
    }   
}


//Uppgift 4
class Node
{
    public int number;
    public Node next;
    public Node previous;
    
    public Node (int number)
    {
        this.number = number;
        this.next = null;
        this.previous = null;
    }
}
class NumberList
{
    public static void main (String[] args)
    {
        // skapa en datastruktur
        Node last = new Node(4);
        Node n = last;
        Node p = null;
        
        for (int i = 3; i >= 1; i--)
        {
            p = new Node(i);
            n.previous = p;
            p.next = n;
            n = p;
        }
        Node first = n; // (1)
        // använd och modifiera datastrukturen
        n = first;
        
        while (n != null)
        {
            System.out.print(n.number + " ");
            n = n.next;
        }
        
        System.out.println("");
        p = new Node (5);
        first.previous = p;
        p.next = first;
        first = p;
        
        visit(last);
    }
    
    public static void visit (Node n)
        {
        while (n != null)
        {
            System.out.print(n.number + " ");
            n = n.previous;
        }
    }
}


//Uppgift 5
public static void sort (char[] sequence)
{
    int lastPos = sequence.length - 1;
    int minPos = 0;
    char e = 0;
    
    for (int pos = 0; pos < lastPos; pos++)
    {
        minPos = pos;
        
        for (int p = pos + 1; p <= lastPos; p++)
            if (sequence[p] < sequence[minPos])
                minPos = p;
        
        if (minPos != pos)
        {
            e = sequence[pos];
            sequence[pos] = sequence[minPos];
            sequence[minPos] = e;
        }
       
        System.out.println(java.util.Arrays.toString(sequence));
    }
}
*/

