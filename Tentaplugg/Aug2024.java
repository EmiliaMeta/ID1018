/* 
// Uppgift 1
// a) u = (4, 5, 1, 2, 3)
// b) v =   (0, 0, 0, 1)
            (0, 0, 1, 0)
            (0, 1, 0, 0)
            (1, 0, 0, 0)


//Uppgift 2
class Int
{
    public static final Int ZERO = new Int(0);
    private int value;
    
    public Int (int value)
    {
        this.value = value;
    }
    
    public int compareTo (Int n)
    {
        int comp = 0;
        if (this.value < n.value)
            comp = -1;
        
        else if (this.value == n.value)
            comp = 0;
        
        else
            comp = 1;
        
        return comp;
    }
}

class IntUtil
{
    //a)
    public static int indexOf(Int[] v, Int obj)
    {
        int index = -1;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].compareTo(obj) == 0)
            {
                index = i;
                return index;
            }
        }
        return index;
    }

    //b)
    public static Int[] positiveInts(Int[] v)
    {
        int size = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].compareTo(Int.ZERO) == 1)
            {
                size++;
            }
        }
        
        Int[] heltal = new Int[size];
        int index = 0;
        
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].compareTo(Int.ZERO) == 1 || v[i].compareTo(Int.ZERO) == 0)
            {
                heltal[index] = v[i];
                index++;
            }
        }
        return heltal;

    }
}

//c)
Int[] vector =  {new Int(5), 
                new Int(-1), 
                new Int(3),
                new Int(50),
                new Int(85)};

                Int heltal = new Int(50);

int index = IntUtil.indexOf(vector, heltal);
Int[] positives = IntUtil.positiveInts(vector);



//Uppgift 3
class ArrayList
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
    
    // set ersätter objektet på ett givet index
    // i listan med ett givet objekt.
    // Om indexet inte är giltigt, kastas ett undantag av typen
    // java.lang.IndexOutOfBoundsException.
    public void set (int index, Object obj) throws IndexOutOfBoundsException
    {
        // koden saknas här
        if(index < 0 || index >= objects.length) 
        {
            throw new IndexOutOfBoundsException("felaktigt index");
        }
        else
        {
            for(int i = 0; i < objects.length; i++)
            {
                if(index == i)
                {
                    objects[i] = obj;
                }
            }

        }

    }
    
    // removeFirst tar bort det första objektet från listan.
    // Om listan är tom, kastas ett undantag av typen
    // java.lang.IllegalStateException.
    public void removeFirst () throws IllegalStateException
    {
        // koden saknas här
        if(objects.length == 0)
            throw new IllegalStateException("list is empty");
        else
        {
            Object[] temp = new Object[objects.length - 1];
            for(int i = 0; i < objects.length - 1; i++)
            {
                temp[i] = objects[i + 1];
            }
            objects = temp;
        }
    }
}


// Uppgift 4
class NumberTree
{
    public static void main (String[] args)
    {
        // skapa en datastruktur
        Node root = new Node(16);
        Node n = root;
        
        n.left = new Node(6);
        n = n.left;
        n.left = new Node(4);
        n.right = new Node(8);
        n.right.left = new Node(7);
        n = root;
        n.right = new Node(24);
        n.right.left = new Node(20);
        n.right.right = new Node(28);
        n = n.right.right;
        n.left = new Node(26);
        n.right = new Node(32);
        // använd datastrukturen
        
        visit(root);
        System.out.println("");
        search(root, 7);
        System.out.println("");
    }
    
    public static void visit (Node n)
    {
        while (n != null)
        {
            System.out.print(n.number + " ");
            n = n.right;
        }
    }
    
    public static void search (Node n, int number)
    {
        boolean found = false;
        
        while (!found && n != null)
        {
            System.out.print(n.number + " ");
            
            if (n.number == number)
            found = true;
            
            else
            {
                if (number < n.number)
                n = n.left;
                else
                n = n.right;
            }
        }
    }
}
// a) se bild
// b)

    16 24 28 32

    16 6 7 8



//Uppgift 5
public static void sort (int[] seq)
{
    int e = 0;
    int h = 0;
    
    for (int i = 1; i < seq.length; i++)
    {
        e = seq[i];
        h = i;
        
        while (h > 0 && e < seq[h - 1])
        {
            seq[h] = seq[h - 1];
            h--;
        }
        
        seq[h] = e;
        
        System.out.println(java.util.Arrays.toString(seq));
    }
}

//a)
    6 3 5 2 4 1

    3 6 5 2 4 1
    3 5 6 2 4 1
    2 3 5 6 4 1
    2 3 4 5 6 1
    1 2 3 4 5 6

*/    




