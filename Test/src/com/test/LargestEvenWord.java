package com.test;

public class LargestEvenWord {

	private String getLargestEvenWord(String sentence)
	{
		String[] splitSentenceArray = sentence.split(" ");
		String largestWord = "";
		for(int i = 0; i < splitSentenceArray.length; i++)
		{
			if(splitSentenceArray[i].length()%2 == 0 && largestWord.length() < splitSentenceArray[i].length())
			{
				largestWord = splitSentenceArray[i];
			}			
		}
		return largestWord;
	}
	
	
	public static void main(String[] args) 
	{
		LargestEvenWord largestEvenWord=new LargestEvenWord();
		System.out.println(largestEvenWord.getLargestEvenWord("start a conversation with your new connection"));
		System.out.println(largestEvenWord.getLargestEvenWord("Raveena Maheshlal Kamra"));
		System.out.println(largestEvenWord.getLargestEvenWord("returning Even word "));
	}

}
