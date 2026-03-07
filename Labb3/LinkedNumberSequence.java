// LinkedNumberSequence.java

/****************************************************************

LinkedNumberSequence represents a sequence of real numbers.
Such a sequence is defined by the interface NumberSequence.
The class uses linked nodes to store the numbers in the sequence.

Author
Fadil Galjic
 
****************************************************************/

public class LinkedNumberSequence implements NumberSequence
{
	private class Node
	{
		public double number;
		public Node next;

		public Node (double number)
		{
			this.number = number;
			next = null;
		}
	}

	// the first node in the node-sequence
    private Node first;

    // create the sequence
    public LinkedNumberSequence (double[] numbers)
    {
		if (numbers.length < 2)
		    throw new IllegalArgumentException("not a sequence");

        first = new Node(numbers[0]);
        Node n = first;
		for (int i = 1; i < numbers.length; i++)
		{
			n.next = new Node(numbers[i]);
			n = n.next;
		}
	}

    // toString returns the character string representing this
    // sequence
	public String toString ()
	{
		String s = "";
		Node n = first;
		while (n.next != null)
		{
		    s = s + n.number + ", ";
		    n = n.next;
		}
		s = s + n.number;

		return s;
	}

    // add code here
	// length returns the number of numbers in this sequence.
	public int length()
	{
		int length = 0;
		Node node = first;
		while(node != null)
		{
			length++;
			node = node.next;
		}
		return length;
	}

	// upperBound returns an upper bound for this sequence.
	public double upperBound()
	{
		Node node = first;
		double max = node.number;
		node = node.next;
		while(node != null)
		{
			if(node.number > max)
				max = node.number;
			node = node.next;
		}
		return max;
	}

    // lowerBound returns a lower bound for this sequence.
	public double lowerBound()
	{
		Node node = first;
		double min = node.number;
		node = node.next;
		while(node != null)
		{
			if(node.number < min)
				min = node.number;
			node = node.next;
		}
		return min;
	}
	
    // numberAt returns the number at the specified position
    // in this sequence.
    // The method throws IndexOutOfBoundsException if the
    // position is wrong.
	public double numberAt(int position) throws IndexOutOfBoundsException
	{
		if(position < 0)
			throw new IndexOutOfBoundsException("Index is out of bounds.\n");
		
		Node node = first;
		
		for(int i = 0; i < position; i++)
		{
			node = node.next;
		}

		if(node == null)
			throw new IndexOutOfBoundsException("Index is out of bounds.\n");

		return node.number;
	}

    // positionOf returns the position of the first occurance of
    // the specified number in this sequence.
    // If the number is not present in the sequence, -1 is returned.
	public int positionOf(double number)
	{
		boolean found = false;
		int index = -1;
		Node node = first;
		int i = 0;
		while(node != null && !found)
		{
			if(node.number == number)
			{
				index = i;
				found = true;				
			}
			node = node.next;
			i++;
		}

		return index;
	}

    // isIncreasing returns true if this sequence is increasing,
    // else false is returned.
	public boolean isIncreasing()
	{
		boolean decrease = false;
		Node node = first;
		
		while(!decrease && node.next != null)
		{
			if(!(node.number < node.next.number))
				decrease = true;
			node = node.next;
		}
		return !decrease;
	}

	// isDecreasing returns true if this sequence is decreasing,
    // else false is returned.
	public boolean isDecreasing()
	{
		boolean increase = false;
		Node node = first;
		
		while(node.next != null)
		{
			if(!(node.number > node.next.number))
				increase = true;
			node = node.next;
		}
		return !increase;
	}

    // contains returns true if this sequence contains the
    // specified number, else false is returned.
	public boolean contains(double number)
	{
		boolean found = false;
		Node node = first;
		
		while(node != null)
		{
			if(node.number == number)
				found = true;
			node = node.next;
		}
		return found;
	}

    // add adds the specified number to the end of this sequence.
	public void add(double number)
	{
		Node node = first;
		Node num = new Node(number);
		while(node.next != null)
		{
			node = node.next;
		}	
		
		node.next = num;
	}

    // insert inserts the given number at the specified position
    // in this sequence.
    // The method throws IndexOutOfBoundsException if the
    // position is wrong.
	public void insert (int position, double number) throws IndexOutOfBoundsException
	{

		if(position < 0)
			throw new IndexOutOfBoundsException("Position is out of bounds.\n");
		
		Node num = new Node(number);

		if(position == 0)
		{
			num.next = first;
			first = num;
			return;
		}
		
		Node node = first;	
		int index = 0;

		while(node != null && index < position - 1)
		{
			index++;
			node = node.next;
		}	

		if(node == null)
			throw new IndexOutOfBoundsException("Position is out of bounds.\n");
		
		num.next = node.next;
		node.next = num;
	}

    // removeAt removes the number at the specified position
    // in this sequence.
    // The method throws IndexOutOfBoundsException if the
    // position is wrong.
    // The method throws IllegalStateException if there are
    // just two numbers in the sequence.
	public void removeAt (int position) throws IndexOutOfBoundsException, IllegalStateException
	{
		if(length() <= 2)
			throw new IllegalStateException("Sequence is too short.\n");

		if(position < 0)
			throw new IndexOutOfBoundsException("Position is out of bounds.\n");

		if(position == 0)
		{
			first = first.next;
			return;
		}

		Node node = first;	
		int index = 0;

		while(node.next != null && index < position - 1)
		{
			index++;
			node = node.next;
		}	
		
		if(node.next == null)
			throw new IndexOutOfBoundsException("Position is out of bounds.\n");
		
		node.next = node.next.next;
	}

    // asArray returns an array containing all of the numbers in
    // this sequence, in the same order as in the sequence.
	public double[] asArray()
	{
		Node node = first;
		double[] array = new double[length()];
		int index = 0;
		while(node != null)
		{
			array[index] = node.number;
			index++;
			node = node.next;
		}

		return array;
	}
}