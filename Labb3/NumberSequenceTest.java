// NumberSequenceTest.java

/****************************************************************

NumberSequenceTest is a test program for the classes
ArrayNumberSequence and LinkedNumberSequence.

Author
Fadil Galjic

****************************************************************/
 
import static java.lang.System.out;

class NumberSequenceTest
{ 
    public static void main (String[] args)
    {
		double[] realNumbers =
		    {8.0, 2.0, 16.0, 5.0, 1.0, 12.0, 4.0};
        NumberSequence sequence = null;
        // sequence = new ArrayNumberSequence(realNumbers);
        sequence = new LinkedNumberSequence(realNumbers);
        out.println("the sequence:");
        out.println(sequence);
        out.println();

        // add code here
        prints(sequence);
    }
    
    public static void prints(NumberSequence sequence)
    { 
        out.println("length: " + sequence.length());                //length
        out.println("one upper bound: " + sequence.upperBound());   //UpperBound
        out.println("one lower bound: " + sequence.lowerBound() + "\n");   //LowerBound
        
        int position = 3; //for numberAt
        out.println("number at position " + position + ": " + sequence.numberAt(position));

        double number = 8; //for positionOf
        out.println("position of " + number + ": " + sequence.positionOf(number));
        out.println(" ");

        out.println("is increasing: " + sequence.isIncreasing()); //isIncreasing
        out.println("is decreasing: " + sequence.isDecreasing()); //isDecreasing
        
        number = 16; //for contains
        out.println("contains " + number + ": " + sequence.contains(number) + "\n");

        double addNum = 32; //for add
        out.println("add " + addNum + ": ");
        sequence.add(addNum);
        out.println(sequence);

        double insertNum = 0; //for insert
        int positionNum = 7;
        out.println("insert " + insertNum + " at " + positionNum + ": ");
        sequence.insert(positionNum, insertNum);
        out.println(sequence);

        int removeNum = 7; //for removeAt
        out.println("remove at position " + removeNum + ": ");
        sequence.removeAt(removeNum);
        out.println(sequence + "\n");

        //asArray
        out.print("corresponding array: \n");
        for(int i = 0; i < sequence.asArray().length; i++)
        {
            out.print(sequence.asArray()[i] + " ");
        }
    }
}