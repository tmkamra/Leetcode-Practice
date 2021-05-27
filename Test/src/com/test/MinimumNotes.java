package com.test;

import java.util.Arrays;

public class MinimumNotes {

	public static void main(String[] args) {
		MinimumNotes minNotes = new MinimumNotes();
		System.out.println(minNotes.getMinNoOfNotes(new int[]{100,100,5,50,10,10,50}, 175));
	}
	
	private int getMinNoOfNotes(int[] notes, int rupees) {
		Arrays.sort(notes);
		int total=0, count=0;
		for(int i=notes.length-1; i>=0; i--) {
			if(notes[i]+total <= rupees ) {
				total = total+notes[i];
				count++;
			}
		}
		return count;
	}
}
