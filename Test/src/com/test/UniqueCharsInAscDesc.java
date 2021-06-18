package com.test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class UniqueCharsInAscDesc {

	public static void main(String[] args) {
		
		UniqueCharsInAscDesc obj = new UniqueCharsInAscDesc();
		System.out.println(obj.getSequenceInAscDesc("abcabcd"));

	}

	
	
	private String getSequenceInAscDesc(String s)
	{
		String output="";
		boolean toggle=false;
		while(s!="")
		{
			PriorityQueue<Character> pq;
			if(!toggle)
			{
				 pq = new PriorityQueue<>();
			}
			else
			{
				 pq = new PriorityQueue<>((x, y) -> Character.compare(y, x));
				 
			}
			
			String s2="";
			for(char c : s.toCharArray())
			{
				if(!pq.contains(c))
					pq.add(c);
				else 
					s2+=c;
			}
			for(char c: pq)
			{
				output= output+c;
			}
			s=s2;
			toggle=!toggle;
		}
		
		return output;
	}
}

class DescSorting implements Comparator<Character>
{
	@Override
	public int compare(Character a, Character b) {
		// TODO Auto-generated method stub
//		if(o2==01)
//			return 0;
//		else if(o1<o2)
//			return 1;
//		else
//			return -1;
		
//		Character.compare(a, b) > 0
		
		if(Character.compare(a, b) > 0) {
            return -1;
        }else if(Character.compare(a, b) < 0) {
        	return 1;
        }else 
        	return 0;
	}
}
