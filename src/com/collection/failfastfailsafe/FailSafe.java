package com.collection.failfastfailsafe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("A", "B", "C");
		CopyOnWriteArrayList<String> strs = new CopyOnWriteArrayList<String>(strings);
		
		Iterator<String> iterator = strs.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			strs.add(string.toLowerCase());
		}

		for (String s : strs) {
			strs.add(s.toLowerCase());
		}
		
		System.out.println(strs);
	}
}
