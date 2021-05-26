package com.test;

public class CharsInSequence {

	public static void main(String[] args) {
		CharsInSequence charsInSequence = new CharsInSequence();
		System.out.println(charsInSequence.getCountCharsInSequence("abcde"));
		System.out.println(charsInSequence.getCountCharsInSequence("Aabbbcccc"));
		System.out.println(charsInSequence.getCountCharsInSequence("a"));
		System.out.println(charsInSequence.getCountCharsInSequence(""));
	}

	private String getCountCharsInSequence(String s) {
		s=s.toLowerCase();
		String countStr="";
		int ctr=1;
		
		if(s.length()==1)
			return s+ctr;
		
		for(int i=0; i<s.length(); i++) {
			if(i!=s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				ctr++;
			} else if(i==s.length()-1 && s.charAt(i)==s.charAt(i-1)) {
				countStr+=s.charAt(i);
				countStr+=ctr;
			} else {
				countStr+=s.charAt(i);
				countStr+=ctr;
				ctr=1;
			}
		}
		return countStr;
	}
}
