package com.test;

import java.util.ArrayList;
import java.util.List;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2,3,5,0,7
		Interview d = new Interview();
		List<Integer> mylist = d.moveZeroes(new int[] { 2, 3, 5, 0, 7, 0, 0, 0, 5, 6, 7, 0, 8 });
		for (int i : mylist) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(d.capitalizeFourLettered("modi is a good man"));
	}

	private List<Integer> moveZeroes(int[] values) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < values.length; i++) {
			if (values[i] != 0) {
				list.add(values[i]);
			}
		}
		if (list.size() == values.length) {
			return list;
		} else {
			int count = values.length - list.size();

			for (int j = 0; j < count; j++) {
				list.add(0);
			}
			return list;
		}
	}

	private String capitalizeFourLettered(String sentence) {
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == 4) {
				words[i] = words[i].toUpperCase();
			}
		}
		String str = "";
		for (String w : words) {
			str += w + " ";
		}
		return str.trim();
	}

}
