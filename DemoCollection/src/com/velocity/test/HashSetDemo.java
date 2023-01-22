package com.velocity.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer>set=new HashSet<Integer> ();
		set.add(10);
		set.add(20);
		set.add(30);
		
		for(int i:set)	{		
		System.out.println(i);
		}
	}

}
