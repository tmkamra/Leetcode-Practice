package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueCharsInAscDesc {

	/*
	 * input abcabcd 
	 * output abcdcba
	 */
	public static void main(String[] args) {

		UniqueCharsInAscDesc obj = new UniqueCharsInAscDesc();
		System.out.println(obj.getSequenceInAscDesc("abcabcd"));
		System.out.println(obj.getSequenceInAscDesc("kamra"));
		System.out.println(obj.getSequenceInAscDesc("trishala"));
	}

	private String getSequenceInAscDesc(String input) {
		String output = "";
		boolean toggle = false;
		while (input != "") {
			List<Character> list = new ArrayList<>();
			String remainingString = "";
			for (char c : input.toCharArray()) {
				if (!list.contains(c))
					list.add(c);
				else
					remainingString += c;
			}
			if (!toggle)
				Collections.sort(list);
			else
				Collections.sort(list, (x, y) -> Character.compare(y, x));

			for (char c : list) {
				output = output + c;
			}
			input = remainingString;
			toggle = !toggle;
		}
		return output;
	}
}