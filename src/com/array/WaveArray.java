package com.array;

import java.util.Arrays;

public class WaveArray {
	public static void main(String[] args) {
		int[] input = { 10, 5, 4, 3, 2, 1 };

		for (int i = 0; i < input.length - 1; i+=2) {
			int temp = input[i];
			input[i] = input[i + 1];
			input[i + 1] = temp;
		}

		System.out.println(Arrays.toString(input));

	}
}
