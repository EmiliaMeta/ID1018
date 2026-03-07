// SynonymHandler

/****************************************************************

SynonymHandler handles information about synonyms for various
words.

The synonym data can be read from a file and handled in various
ways. These data consists of several lines, where each line begins
with a word, and this word is followed with a number of synonyms.

The synonym line for a given word can be obtained. It is possible
to add a synonym line, and to remove the synonym line for a given
word. Also a synonym for a particular word can be added, or
removed. The synonym data can be sorted. Lastly, the data can be
written to a given file.

Author: Fadil Galjic

****************************************************************/

import java.io.*;    // FileReader, BufferedReader, PrintWriter,
                     // IOException

class SynonymHandler
{
	// readSynonymData reads the synonym data from a given file
	// and returns the data as an array
    public static String[] readSynonymData (String synonymFile)
                                         throws IOException
    {
        BufferedReader reader = new BufferedReader(
	        new FileReader(synonymFile));
        int numberOfLines = 0;
        String synonymLine = reader.readLine();
        while (synonymLine != null)
        {
			numberOfLines++;
			synonymLine = reader.readLine();
		}
		reader.close();

		String[] synonymData = new String[numberOfLines];
        reader = new BufferedReader(new FileReader(synonymFile));
		for (int i = 0; i < numberOfLines; i++)
		    synonymData[i] = reader.readLine();
		reader.close();

		return synonymData;
    }

    // writeSynonymData writes a given synonym data to a given
    // file
    public static void writeSynonymData (String[] synonymData,
        String synonymFile) throws IOException
    {
        PrintWriter writer = new PrintWriter(synonymFile);
        for (String synonymLine : synonymData)
            writer.println(synonymLine);
        writer.close();

    }

    // synonymLineIndex accepts synonym data, and returns the
    // index of the synonym line corresponding to a given word.
    // If the given word is not present, an exception of
    // the type IllegalArgumentException is thrown.
	private static int synonymLineIndex (String[] synonymData,
        String word) throws IllegalArgumentException
    {
		int delimiterIndex = 0;
		String w = "";
		int i = 0;
		boolean wordFound = false;
		while (!wordFound  &&  i < synonymData.length)
		{
		    delimiterIndex = synonymData[i].indexOf('|');
		    w = synonymData[i].substring(0, delimiterIndex).replace(",", "").trim();
		    if (w.equalsIgnoreCase(word))
				wordFound = true;
			else
				i++;
	    }

	    if (!wordFound)
	        throw new IllegalArgumentException(
		        word + " not present");

	    return i;
	}

    // getSynonymLine accepts synonym data, and returns
    // the synonym line corresponding to a given word.
    // If the given word is not present, an exception of
    // the type IllegalArgumentException is thrown.
    public static String getSynonymLine (String[] synonymData,
        String word) throws IllegalArgumentException
    {
		int index = synonymLineIndex(synonymData, word);

	    return synonymData[index];
	}

    // addSynonymLine accepts synonym data, and adds a given
    // synonym line to the data.
	public static String[] addSynonymLine (String[] synonymData,
	    String synonymLine)
	{
		String[] synData = new String[synonymData.length + 1];
		for (int i = 0; i < synonymData.length; i++)
		    synData[i] = synonymData[i];
		synData[synData.length - 1] = synonymLine;

	    return synData;
	}

    // removeSynonymLine accepts synonym data, and removes
    // the synonym line corresponding to a given word.
    // If the given word is not present, an exception of
    // the type IllegalArgumentException is thrown.
	public static String[] removeSynonymLine (String[] synonymData,
	    String word) throws IllegalArgumentException
	{
		// add code here
        
        int index = synonymLineIndex(synonymData, word);
        String[] temp = new String[synonymData.length - 1];

        for(int i = 0, j = 0; i < synonymData.length; i++)
        {
            if(i != index)
            {
                temp[j] = synonymData[i];
                j++;
            }
        }
        return temp; 
	}

  // getSynonyms returns synonyms in a given synonym line.
private static String[] getSynonyms (String synonymLine)
{
    int delimiterIndex = synonymLine.indexOf('|');
    String synonymPart = synonymLine.substring(delimiterIndex + 1).trim();

    String[] synonyms = synonymPart.split(",");

    for (int i = 0; i < synonyms.length; i++)
    {
        synonyms[i] = synonyms[i].trim();
    }

    return synonyms;
}


    // addSynonym accepts synonym data, and adds a given
    // synonym for a given word.
    // If the given word is not present, an exception of
    // the type IllegalArgumentException is thrown.
	public static void addSynonym (String[] synonymData,
	    String word, String synonym) throws IllegalArgumentException
	{
        // add code here
        int index = synonymLineIndex(synonymData, word);
        String[] oldSynonyms = getSynonyms(synonymData[index]);
        String[] newSynonyms = new String[oldSynonyms.length + 1];

        for(int i = 0; i < oldSynonyms.length; i++)
        {
            newSynonyms[i] = oldSynonyms[i];
        }
        newSynonyms[newSynonyms.length - 1] = synonym;
        
        String newLine = word + " | ";
        for(int i = 0; i < newSynonyms.length; i++)
        {
            newLine += newSynonyms[i];
            if(i < newSynonyms.length - 1)
                newLine += ", ";
        }
        synonymData[index] = newLine;
	}

    // removeSynonym accepts synonym data, and removes a given
    // synonym for a given word.
    // If the given word or the given synonym is not present, an
    // exception of the type IllegalArgumentException is thrown.
    // If there is only one synonym for the given word, an
    // exception of the type IllegalStateException is thrown.
	public static void removeSynonym (String[] synonymData,
	    String word, String synonym)
	    throws IllegalArgumentException, IllegalStateException
	{
        // add code here
        int index = synonymLineIndex(synonymData, word);
        String[] oldSynonyms = getSynonyms(synonymData[index]);
        
        if(oldSynonyms.length == 1)
        {
            throw new IllegalStateException("The word " + word + " only has one synonym.");
        }
        String[] newSynonyms = new String[oldSynonyms.length - 1];

        boolean found = false;
        int synonymIndex = -1;
        for(int i = 0; i < oldSynonyms.length && !found; i++)
        {
            if(synonym.equals(oldSynonyms[i]))
            {
                synonymIndex = i;
                found = true;
            }
        }
        
        if(!found)
        {
            throw new IllegalArgumentException("Synonym does not exist for word");
        }
        
        for(int i = 0; i < synonymIndex; i++)
        {
            newSynonyms[i] = oldSynonyms[i];
        }

        for(int i = synonymIndex; i < oldSynonyms.length - 1; i++)
        {
            newSynonyms[i] = oldSynonyms[i+1];
        }

        String newLine = word + " | ";
        for(int i = 0; i < newSynonyms.length; i++)
        {
            newLine += newSynonyms[i];
            if(i < newSynonyms.length - 1)
                newLine += ", ";
        }
        synonymData[index] = newLine;   
	} 

    // sortIgnoreCase sorts an array of strings, using
    // the selection sort algorithm
    private static void sortIgnoreCase (String[] strings)
    {
        // add code here
        int lastPos = strings.length - 1;
        int minPos;

        for (int pos = 0; pos < lastPos; pos++)
        {
            minPos = pos;

            for (int i = pos + 1; i <= lastPos; i++)
            {
                if (strings[i].compareToIgnoreCase(strings[minPos]) < 0)
                {
                    minPos = i;
                }
            }

            if (minPos != pos)
            {
                String temp = strings[pos];
                strings[pos] = strings[minPos];
                strings[minPos] = temp;
            }
        }
	}

    // sortSynonymLine accepts a synonym line, and sorts
    // the synonyms in this line
    private static String sortSynonymLine (String synonymLine)
    {
	    // add code here
        int delimiterIndex = synonymLine.indexOf('|');
        String word = synonymLine.substring(0, delimiterIndex).trim();
        String[] synonyms = getSynonyms(synonymLine);
        
        sortIgnoreCase(synonyms);

        String newLine = word + " | ";
        for (int i = 0; i < synonyms.length; i++)
        {
            newLine += synonyms[i];
            if (i < synonyms.length - 1)
                newLine += " ";
        }

        return newLine;
    }



    // sortSynonymData accepts synonym data, and sorts its
    // synonym lines and the synonyms in these lines
	public static void sortSynonymData (String[] synonymData)
	{
        // add code here
        sortIgnoreCase(synonymData);

        for (int i = 0; i < synonymData.length; i++)
        {
            synonymData[i] = sortSynonymLine(synonymData[i]);
        }
	}
}