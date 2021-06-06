package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrangeInAscDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrangeInAscDesc obj = new ArrangeInAscDesc();
		List<Integer> l = obj.getAscDescArray(new int[] { 4, 5, 7, 8, 3, 6, 7, 1, 2, 9 });
		for (int i : l) {
			System.out.print(i + " ");
		}
	}

	private List<Integer> getAscDescArray(int[] values) {
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(values);
		for (int i = 0, j = values.length - 1; i < values.length / 2; i++, j--) {
			if (i == values.length / 2) {
				list.add(values[i]);
			} else {
				list.add(values[i]);
				list.add(values[j]);
			}
		}
		return list;
	}

}
