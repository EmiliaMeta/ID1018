public class apr2023 {
    
}
class IntUtil
{
    public static boolean contains(Int[] v, Int heltal)
    {
        for(int i = 0; i < v.length; i++)
            if(!(v[i].lessThan(heltal)) && !(heltal.lessThan(v[i])))
                return true;
        return false;
    }

    public static Int[] primeInts(Int[] v)
    {
        int size = 0;
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].isPrime())
            {
                size++;
            }
        }
        Int[] primes = new Int[size]; 
        int index = 0;
        
        for(int i = 0; i < v.length; i++)
        {
            if(v[i].isPrime())
            {
                primes[index] = v[i];
                index++;
            }
        } 
        return primes; 
    }

}

Int[] vector = {new Int(3),
                new Int(4),
                new Int(6),
                new Int(13),
                new Int(57)};

boolean verify_contens = IntUtil.contains(vector, new Int(4));
Int[] primes = IntUtil.primeInts(vector);


// Uppgift 3
public boolean contains(Character c)
{
    for(int i = 0; i < chars.length; i++)
    {
        if(chars[i].equals(c))
        {
            return true;
        }
    }
    return false;
}

public void insert (int index, Character ch)
{
    if(index < 0 || index > chars.length)
    {
        throw new IndexOutOfBoundsException();
    }

    Character[] temp = new Character[chars.length + 1];
    for (int i = 0; i < index; i++)
        temp[i] = chars[i];

    temp[index] = ch;

    for (int i = index; i < chars.length; i++)
        temp[i + 1] = chars[i];

    
    chars = temp;
}

//uppgift 4
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
    // koden saknas här
    public double perimeter()
    {
        return radius*2*Math.PI;
    }

    public double area()
    {
        return Math.PI*radius*radius;
    }
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
    
    // koden saknas här
    public double perimeter()
    {
        return 2*(length + width);
    }

    public double area()
    {
        return length * width;
    }
    
}

class RegionUtil
{
    public static Rectangle[] selectRectangles(Region[] v)
    {
        int size = 0;
        for(Region r : v)
            if(r instanceof Rectangle)
                size++;

        Rectangle[] rectangles = new Rectangle[size];
        int i = 0;
        int j = 0;
        while(j < rectangles.length)
        {
            if(v[i] instanceof Rectangle)
            {
                rectangles[j] = (Rectangle) v[i];
                j++;
                i++;
            }
        }
        return rectangles;
    }
}

Region[] objects = {new Rectangle(1, 1), 
                    new Circle(3), 
                    new Rectangle(8, 2),
                    new Circle(2)};
                    
Rectangle[] rectangles = RegionUtil.selectRectangles(objects);

