package com.test;

public class Pangram {

	public static void main(String[] args) {
		Pangram pangram = new Pangram();
		System.out.println(pangram.checkPangram("This is an apple"));
		System.out.println(pangram.checkPangram("A quick brown fox jumps over the lazy dog"));
		System.out.println(pangram.checkPangram("waltz, nymph, for quick jigs vex bud"));
	}
	
	private boolean checkPangram(String s)
	{
		int smallLetterCounter=97, capLetterCounter=65;
		for(int i=0; i<26; i++, smallLetterCounter++, capLetterCounter++)
		{
			if(!s.contains(Character.toString((char)capLetterCounter)) && !s.contains(Character.toString((char)smallLetterCounter)))
				return false;
		}
		return true;
	}

}
