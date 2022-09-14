package com.velocity.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Harshada");
		nameList.add("Harsha");
		nameList.add("Harshu");
		nameList.add("Harsh");
		
		Iterator<String> itr = nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
