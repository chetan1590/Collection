package com.collection.failfastfailsafe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("A", "B", "C");
		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			strings.add(string.toLowerCase());
		}

		for (String s : strings) {
			strings.add(s.toLowerCase());
		}

	}
}
