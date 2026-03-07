// ArrayNumberSequence.java

/****************************************************************

ArrayNumberSequence represents a sequence of real numbers.
Such a sequence is defined by the interface NumberSequence.
The class uses an array to store the numbers in the sequence.

Author
Fadil Galjic
 
****************************************************************/

public class ArrayNumberSequence implements NumberSequence
{
	// numbers in the sequence
    private double[] numbers;

    // create the sequence
    public ArrayNumberSequence (double[] numbers)
    {
		if (numbers.length < 2)
		    throw new IllegalArgumentException("not a sequence");

		this.numbers = new double[numbers.length];
		for (int i = 0; i < numbers.length; i++)
		    this.numbers[i] = numbers[i];
	}

    // toString returns the character string representing this
    // sequence
	public String toString ()
	{
		String s = "";
		for (int i = 0; i < numbers.length - 1; i++)
		    s = s + numbers[i] + ", ";
		s = s + numbers[numbers.length - 1];

		return s;
	}

    // add code here

	// length returns the number of numbers in this sequence.
	public int length()
	{
		return numbers.length;
	}

	// upperBound returns an upper bound for this sequence.
	public double upperBound()
	{
		double max = numbers[0];
		for(int i = 1; i < numbers.length; i++)
			if(numbers[i] > max)
				max = numbers[i];


		return max;
	}

    // lowerBound returns a lower bound for this sequence.
	public double lowerBound()
	{
		double min = numbers[0];
		for(int i = 1; i < numbers.length; i++)
			if(numbers[i] < min)
				min = numbers[i];


		return min;
	}
	
    // numberAt returns the number at the specified position
    // in this sequence.
    // The method throws IndexOutOfBoundsException if the
    // position is wrong.
	public double numberAt(int position) throws IndexOutOfBoundsException
	{
		if(position < 0 || position >= numbers.length)
			throw new IndexOutOfBoundsException("Position is out of bounds.\n");

		return numbers[position];
	}

    // positionOf returns the position of the first occurance of
    // the specified number in this sequence.
    // If the number is not present in the sequence, -1 is returned.
	public int positionOf(double number)
	{
		boolean found = false;
		int index = -1;
		for(int i = 0; i < numbers.length && !found; i++)
			if(number == numbers[i]) 
			{
				index = i;
				found = true;
			}
		return index;
	}

    // isIncreasing returns true if this sequence is increasing,
    // else false is returned.
	public boolean isIncreasing()
	{
		boolean decrease = false;
		for(int i = 1; i < numbers.length && !decrease; i++)
		{
			if(!(numbers[i] > numbers[i - 1]))
				decrease = true;
		}

		return !decrease;
	}

	// isDecreasing returns true if this sequence is decreasing,
    // else false is returned.
	public boolean isDecreasing()
	{
		boolean increase = false;
		for(int i = 1; i < numbers.length && !increase; i++)
		{
			if(!(numbers[i] < numbers[i - 1]))
				increase = true;
		}

		return !increase;
	}


    // contains returns true if this sequence contains the
    // specified number, else false is returned.
	public boolean contains(double number)
	{
		boolean found = false;
		for(int i = 0; i < numbers.length && !found; i++)
		{
			if(numbers[i] == number)
				found = true;
		}
		return found;
	}

    // add adds the specified number to the end of this sequence.
	public void add(double number)
	{
		double[] temp = new double[numbers.length + 1];
		for(int i = 0; i < numbers.length; i++)
			temp[i] = numbers[i];

		temp[temp.length - 1] = number;
		numbers = temp;
	}

    // insert inserts the given number at the specified position
    // in this sequence.
    // The method throws IndexOutOfBoundsException if the
    // position is wrong.
	public void insert (int position, double number) throws IndexOutOfBoundsException
	{
		if(position < 0 || position >= numbers.length + 1)
			throw new IndexOutOfBoundsException("Position is out of bounds.\n");
		
		double[] temp = new double[numbers.length + 1];
		
		for(int i = 0; i < position; i++)
			temp[i] = numbers[i];
		
		temp[position] = number;

		for(int i = position; i < numbers.length; i++)
			temp[i + 1] = numbers[i];

		numbers = temp;
	}

    // removeAt removes the number at the specified position
    // in this sequence.
    // The method throws IndexOutOfBoundsException if the
    // position is wrong.
    // The method throws IllegalStateException if there are
    // just two numbers in the sequence.
	public void removeAt (int position) throws IndexOutOfBoundsException, IllegalStateException
	{
		if(numbers.length <= 2)
			throw new IllegalStateException("Sequence is too short.\n");
		else if(position < 0 || position >= numbers.length)
			throw new IndexOutOfBoundsException("Position is out of bounds.\n");

		double[] temp = new double[numbers.length - 1];
		
		for(int i = 0; i < position; i++)
			temp[i] = numbers[i];

		for(int i = position; i < numbers.length - 1; i++)
			temp[i] = numbers[i + 1];

		numbers = temp;
	}

    // asArray returns an array containing all of the numbers in
    // this sequence, in the same order as in the sequence.
	public double[] asArray()
	{
		double[] array = new double[numbers.length];
		for(int i = 0; i < numbers.length; i++)
			array[i] = numbers[i];
		return array;
	}
}