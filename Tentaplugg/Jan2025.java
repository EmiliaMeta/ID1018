/* 
// Uppgift 1
class Arrays
{
    public static void main (String[] args)
    {
    int[] p = {1, 2, 3, 4, 5};
    int[][] q = {   {0, 0, 0, 1},
                    {0, 0, 1, 0},
                    {0, 1, 0, 0},
                    {1, 0, 0, 0} };
    int[] u = handle(p);
    int[][] v = handle(q);
    }
    public static int[] handle (int[] a)
    {
        int[] v = new int[a.length];
        int i = 0;
        while (i <= a.length - 2)
        {
            v[i] = a[i + 1];
            v[i + 1] = a[i];
            i = i + 2;
        }
        if (i <= a.length - 1)
            v[i] = a[i];
        return v;
    }
    
    public static int[][] handle (int[][] a)
    {
        int[][] b = new int[a.length][];
        for (int i = 0; i < a.length; i++)
            if (i % 2 == 0)
                b[i] = a[i];
            else
                b[i] = new int[a[i].length];
        return b;
    }
}
// a) rita vektor som refereras av u
// u = 2, 1, 4, 3, 5

// b) rita vektor som refereras av v
    
    v =     0, 0, 0, 1
            0, 0, 0, 0
            0, 1, 0, 0
            0, 0, 0, 0
    



// Uppgift 2
class Char
{
    private char ch;
    
    public Char (char ch)
    {
        this.ch = ch;
    }
    
    public boolean isEnglishLetter ()
    {
        return (65 <= ch && ch <= 90) || (97 <= ch && ch <= 122);
    }
    
    public boolean equals (Char c)
    {
        return this.ch == c.ch;
    }
}

class CharUtil
{
    // a)
    public static int indexOf(Char[] v, Char ch)
    {
        int index = -1;
        for(int i = 0; i < v.length; i++)
        {
            if(ch.equals(v[i]))
            {
                index = i;
                return index;
            }
        }
        return index;
    }

    // b)
    public static Char[] englishLetters(Char[] v)
    {
        int size = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].isEnglishLetter())
            {
               size++; 
            }
            
        }

        Char[] letters = new Char[size];
        int number_of_letters = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].isEnglishLetter())
            {   
                letters[number_of_letters] = v[i];
                number_of_letters++;
            }
        }
        return letters;
    }
}

// c)
Char[] vector = {new Char('5'), 
            new Char('L'), 
            new Char('c'), 
            new Char('+'),};

Char character = new Char('c');

int index = CharUtil.indexOf(vector, character);
Char[] englishLetters = CharUtil.englishLetters(vector);



// Uppgift 3

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
    
    // addFirst lägger till ett givet objekt i början av listan
    public void addFirst (T obj)
    {
        // koden saknas här
        Object[] longerObjects = new Object[objects.length + 1];
        longerObjects[0] = obj;
        for(int i = 0; i < objects.length; i++)
        {
            longerObjects[i + 1] = objects[i];
        }
        objects = longerObjects;
        
    }
    
    // contains returnerar true om ett givet objekt finns
    // i listan, annars false.
    public boolean contains (Object obj)

    {
        // koden saknas här
        for(int i = 0; i < objects.length; i++)
        {
            if(objects[i].equals(obj))
                return true;
        }
        return false;
    }
}


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
    // addLast lägger till ett givet heltal på slutet i listan
    // b)
    public void addLast (int number)
    {
        // koden saknas här
        Node end = new Node(number);
        if(first == null)
            first = end;

        else 
        {
            Node n = first;
            while(n.next != null)
                n = n.next;
            n.next = end;
        }
    }

        // toArray returnerar heltalen i listan i en vektor
    public int[] toArray ()
    {
        int size = 0;
        Node node = first;

        while(node != null)
        {
            node = node.next;
            size++;
        }

        int[] list = new int[size];
        node = first;
        int i = 0;
        while(node != null)
        {
            list[i] = node.number;
            node = node.next;
            i++;
        }
        return list;
    }
}
*/



