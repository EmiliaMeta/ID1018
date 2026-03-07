
/* 
//Uppgift 2
class Int
{
    public static final Int ZERO = new Int(0);
    private int value;
    public Int (int value)
    {
        this.value = value;
    }
    public Int add (Int n)
    {
        return new Int(this.value + n.value);
    }
    public boolean lessThan (Int n)
    {
        return this.value < n.value;
    }
    public String toString()
    {
        return "" + value;
    }

}

class IntUtil
{
//a: Skapa metoden sum
    public static Int sum (Int[] v)
    {
        Int result = Int.ZERO;
        for (int i = 0; i <= v.length - 1; i++){
        result = result.add(v[i]);
        }
        return result; 
    } 

//b: Skapa metoden lessThenInts
    public static Int[] lessThanInts(Int[] v, Int n)
    {
        int counter = 0;
        
        for (int p = 0; p <= v.length - 1; p++)
        {
            if (v[p].lessThan(n))
                {
                    counter = counter + 1;
                }
        }
        
        Int[] result = new Int[counter];
        int index = 0;
        
        for (int i = 0; i <= v.length - 1; i++)
        {
            if (v[i].lessThan(n))
            {
                result[index] = v[i];
                index = index + 1;
            }
        }
        return result;
    }
}

// c: skapa en vektor med heltal, och ett heltal. Anropa sum och lessThanInts och lagra
class Test 
{
    public static void main(String[] args)
    {
        Int[] n = { new Int(5),
            new Int(25),
            new Int(-2),            
            new Int(-1),
            new Int(1),
            new Int(4),
            new Int(-8),            
            new Int(12),                      
        };
        Int number = new Int(4);

        Int summa = IntUtil.sum(n);
        Int[] vektor = IntUtil.lessThanInts(n, number); 
        System.out.println("summan ar: " + summa + "\noch vektorn ar: ");
        for (Int x : vektor)
        {
            System.out.print(x + " ");
        }
    }
}

// Uppgift 3
interface Region
{
// perimeter returnerar områdets omkrets
double perimeter ();
// area returnerar områdets area
double area ();
}

class Circle implements Region
{
// cirkelns radie
private double radius;

public Circle (double radius)
    {
    this.radius = radius;
    }

public double area(){
    return radius * radius * Math.PI;
}

public double perimeter(){
    return 2 * Math.PI * radius;
}
public String toString()
{
    return "Circle(radius=" + radius + ", area=" + area() + ")";
}
// koden saknas här
}

class Rectangle implements Region
{
// rektangelns sidlängder
private double length;
private double width;

public Rectangle (double length, double width)
    {
    this.length = length;
    this.width = width;
    }

public double area(){
    return length * width;
}

public double perimeter(){
    return length + length + width + width;
}
public String toString()
{
    return "Rectangle(length=" + length +
           ", width=" + width +
           ", area=" + area() + ")";
}
// koden saknas här
}

class RegionUtil
{
    public static Region min(Region[] vector)
    {
        Region min = vector[0];
        for(int i = 0; i < vector.length - 1; i++){
            if(vector[i].area()< min.area()){
                min = vector[i];
            }
        }
        return min;
    }
}
class Test 
{
    public static void main(String[] args)
    {
       Region[] v =    {
                new Rectangle(3,5),
                new  Circle(3), 
                };
        Region answer = RegionUtil.min(v); 
        System.out.println("Smallest area is " + answer);
    }
}

// Uppgift 4
class MutableString
{
    private static class Node
    {
        public char ch;
        public Node next;
        
        public Node (char ch)
        {
            this.ch = ch;
            this.next = null;
        }
    }
// antalet tecken i teckensträngen
private int numberOfChars = 0;

private Node first = null;

public MutableString (char[] chars)
{
    if (chars != null)
    {
        Node n = new Node(chars[0]);
        first = n;
        for (int pos = 1; pos < chars.length; pos++)
        {
            n.next = new Node(chars[pos]);
            n = n.next;
        }
        numberOfChars = chars.length;
    }
}
public String toString ()
{
    StringBuilder sb = new StringBuilder("");
    Node n = first;
    while (n != null)
    {
        sb.append(n.ch);
        n = n.next;
    }
    return sb.toString();
}
// charAt returnerar det tecken som finns på ett givet index i teckensträngen.
// Om ett index som inte finns i teckensträngen anges, kastas
// ett undantag av typen java.lang.IndexOutOfBoundstion.
public char charAt (int index) throws java.lang.IndexOutOfBoundsException
{
    if (0 <= index && index < numberOfChars)
    {
        Node start = first;
        for(int i = 0; i < index; i++)
        {
            start = start.next;
        }
        return start.ch;
    }
    else{throw new IndexOutOfBoundsException("\nchar på valt index finns ej\n");}
}
// koden saknas här

// addFirst lägger till ett givet tecken i början av teckensträngen.
public void addFirst (char ch)
{
// koden saknas här
Node node = new Node(ch);
node.next = first;
first = node;

numberOfChars++;
}

public char getFirst() throws java.lang.IndexOutOfBoundsException
{
    if(numberOfChars != 0)
    {
        return first.ch;
    }
    else{throw new IndexOutOfBoundsException("försök igen");}// skriv kod
}

public char getLast() throws java.lang.IndexOutOfBoundsException
{
    if(numberOfChars != 0)
    {
        Node start = first;
        for(int i = 0; i < numberOfChars - 1; i++)
        {
            start = start.next;
        }
        return start.ch;
    }
    else{throw new IndexOutOfBoundsException("försök igen");}// skriv kod
}
public boolean contains(char ch)
{
    Node start = first;
    if(first != null)
    {
        if(start.ch == ch)
        {
            return true;
        }
        else
        {
            for(int i = 0; i < numberOfChars - 1; i++)
            {
                start = start.next;
                if(start.ch == ch)
                {
                    return true;
                }
                
            }
            return false;
        }
    }
    else{return false;}  
}
}

// svar a:
// (str-> 5) (first->) s -> u -> n -> n -> y -> null
*/
// Uppgift 5
/*
a) 
E B F A D C

E B F C D A
E D F C B A
E D F C B A
E F D C B A
F E D C B A

*/
