/* 
// Uppgift 1
class Arrays
{
    public static void main (String[] args)
    {
        int[] p = {0, 1, 2, 3, 4, 5};
        int[][] q = {   {1, 2, 3, 4},
                        {2, 3, 4, 5},
                        {3, 4, 5, 6},
                        {4, 5, 6, 7} };
        int[] u = handle(p);
        int[][] v = handle(q);
    }
    public static int[] handle (int[] a)
    {
        int[] v = new int[a.length];
        int i = a.length - 1;
        while (i >= 1)
        {
            v[i - 1] = a[i];
            v[i] = a[i - 1];
            i = i - 2;
        }
            if (i >= 0)
            v[i] = a[i];
            return v;
    }
    public static int[][] handle (int[][] a)
    {
        int[][] b = new int[a.length][];
        for (int i = 0; i < a.length; i++)
            b[i] = new int[a[i].length];
        int j = 0;
        for (int i = 0; i < a.length; i++)
            b[i][j++] = a[i][0];
        return b;
    }
}
// a) u = (1,0,3,2,5,4)
// b) v =  {(1, 0, 0, 0)
//          (0, 2, 0, 0)
//          (0, 0, 3, 0)
//          (0, 0, 0, 4)


//Uppgift 2
class Char
{
    private char ch;
    public Char (char ch)
    {
        this.ch = ch;
    }
    public boolean isDigit ()
    {
        return 48 <= ch && ch <= 57;
    }
    public int compareTo (Char c)
    {
        int comp = 0;
        if (this.ch < c.ch)
        comp = -1;
        else if (this.ch == c.ch)
        comp = 0;
        else
        comp = 1;
        return comp;
    }
}

class CharUtil
{
    // a)
    public static int lastIndexOf(Char[] v, Char ch)
    {
        int index = -1;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].compareTo(ch)==0)
            {
                index = i;
            }

        }
        return index;
    }

    // b)
    public static Char[] getDigits(Char[] v)
    {
        int length = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].isDigit());
            {
               length++;
            }
        }
        int j = 0;
        Char[] digits = new Char[length];
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].isDigit())
            {
                digits[j] = v[i];
                j++;
            }
        }
        return digits;
    }
}


//Uppgift 3
class ArrayList<T>
{
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
// addLast lägger till ett givet objekt på slutet i listan.
    public void addLast (T obj)
    {
        // b)
        // koden saknas här
        Object[] a = new Object[objects.length + 1];
        for(int i = 0; i < objects.length; i++)
        {
            a[i] = objects[i];
        }
        a[objects.length] = obj;
        objects = a;
    }


// elementAt returnerar det objekt i listan som finns
// på ett givet index.
// Om indexet inte är giltigt, kastas ett undantag av typen
// java.lang.IndexOutOfBoundsException.
    public T elementAt (int index) throws IndexOutOfBoundsException
    {
        // c)
        // koden saknas här

        if(index < 0 || index > objects.length - 1)
        {
        throw new IndexOutOfBoundsException();  
        }
        else
        {
            return (T) objects[index];
        }
    }
}
*/

//Uppgift 4
class IntList
{
    private static class Node
    {
        public int number;
        public Node next;
        
        public Node (int number)
        {
            this.number = number;
            this.next = null;
        }
    }
    
    private Node first;
    
    public IntList (int[] numbers)
    {
        if (numbers.length == 0)
            first = null;
        else
        {
            Node n = new Node(numbers[0]);
            first = n;
            for (int i = 1; i < numbers.length; i++)
            {
                n.next = new Node(numbers[i]);
                n = n.next;
            }
        }
    }
    
    public String toString ()
    {
        String s = "{";
        
        if (first != null)
        {
            Node n = first;
            while (n.next != null)
            {
                s += n.number + ", ";
                n = n.next;
            }
            s += n.number;
        }
        s += "}";
        
        return s;
    }
// size returnerar antalet heltal i listan.
    public int size ()
    {
        int size = 0;
        Node start = first;
        while(start != null)
        {
            start = start.next;
            size++; 
        }
        return size;
    }
// koden saknas här

// remove tar bort det heltal i listan som finns på ett givet index.
// Om indexet inte är giltigt, kastas ett undantag av typen
// java.lang.IndexOutOfBoundsExceptionn
    public void remove (int index) throws IndexOutOfBoundsException
    {
        // koden saknas här
        if(index < 0 || index > this.size() - 1)
            throw new IndexOutOfBoundsException("Faulty index: " + index);
        if(index == 0)
            first = first.next;
        else 
        {
            Node n = first;
            for(int i = 0; i < index - 1; i++)
            {
                n = n.next;
            }
            n.next=n.next.next;
        }
    }   

}
