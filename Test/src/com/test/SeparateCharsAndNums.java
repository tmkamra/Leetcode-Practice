package com.test;

public class SeparateCharsAndNums {

	public static void main(String[] args) {
		SeparateCharsAndNums separateCharsAndNums = new SeparateCharsAndNums();
		System.out.println(separateCharsAndNums.getSeparatedString("ab5rj97n90k"));
	}

	private String getSeparatedString(String s) {
		String nums="",chars = "";
		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				nums = nums + c;
			} else {
				chars = chars + c;
			}
		}
		return chars + nums;
	}
}
