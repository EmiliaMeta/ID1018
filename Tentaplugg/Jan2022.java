public class Jan2022 {
    
}

//2
class Point
{
public static final Point ORIGIN = new Point (0, 0);
// punktens koordinater
private double x;
private double y;
public Point (double x, double y)
{
this.x = x;
this.y = y;
}
public double distance (Point p)
{
return Math.sqrt ( (this.x - p.x) * (this.x - p.x) +
(this.y - p.y) * (this.y - p.y) );
}
}

public static Point nearestPoint(Point[] points)
{
    double dist = points[0].distance(Point.ORIGIN);
    Point min = points[0];
    for(int i = 1; i < points.length; i++)
    {
        if(points[i].distance(Point.ORIGIN) < dist)
        {
            dist = points[i].distance(Point.ORIGIN);
            min = points[i];
        }
    }

    return min;
}

public static Point[] selectpoints(Point[] points, Point p)
{
    int size = 0;
    for(int i = 0; i < points.length; i++)
        if(points[i].distance(p) < 4)
        {
            size++;
        }

    Point[] fours = new Point[size];
    
    for(int i = 0, j = 0; i < points.length; i++)
    {
        if(points[i].distance(p) < 4)
            fours[j++] = points[i];
    }
    return fours;
}

Point[] points ={   new Point(0,0), 
                    new Point(2,2), 
                    new Point(3,3), 
                    new Point(4,4)};

Point closest = nearestPoint(points);
Point[] less_than_4 = selectpoints(points, new Point(10, 10));

//3
class Dictionary
{
    // Word representerar ett ord i en svensk-engelsk ordbok
    private static class Word
    {
        // ordet på svenska och engelska
        public String sWord;
        public String eWord;
        
        public Word (String sWord, String eWord)
        {
            this.sWord = sWord;
            this.eWord = eWord;
        }
        
        public String toString ()
        {
            return sWord + " --> " + eWord;
        }
    }
    private Word[] words;
    
    public Dictionary ()
    {
        words = new Word[0];
    }

    public String toString ()
    {
        String s = "";
        for (int i = 0; i < words.length; i++)
        s = s + words[i] + "\n";
        return s;
    }
    // addWord tar emot ett ord både på svenska och engelska,
    // och lägger till ordet till ordboken.
    public void addWord (String sWord, String eWord)
    {
       // koden saknas här
       Word[] temp = new Word[words.length + 1];
       for(int i = 0; i < words.length; i++)
       {
        temp[i] = words[i];
       }
       
       temp[temp.length - 1] = new Word(sWord, eWord);
       words = temp;
    }
    
    // translate tar emot ett ord på svenska, och returnerar det på engelska.
    // Om det givna ordet inte finns i ordboken, kastas ett undantag av typen
    // java.lang.IllegalArgumentException.
    public String translate (String sWord) throws IllegalArgumentException
    {
        // koden saknas här
        boolean found = false;
        int index = 0;
        for(int i = 0; i < words.length && !found; i++)
        {
            if(sWord.equals(words[i].sWord))
            {
                index = i;
                found = true;
            }
        }

        if(found == false)
            throw new IllegalArgumentException("Word is not in dictionary.\n");

        return words[index].eWord;
    }
}