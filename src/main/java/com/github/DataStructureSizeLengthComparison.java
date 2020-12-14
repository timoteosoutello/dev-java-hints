package com.github;

import java.util.ArrayList;
import java.util.List;

public class DataStructureSizeLengthComparison {
	public static void main(String[] args) {
		final int arrayListSize = 100000000;
		final String stringToBeAdded = "Without limit size you are loser";

		List<String> listWithoutLimitedSize = new ArrayList<>();
		List<String> listWithLimitedSize = new ArrayList<>(arrayListSize);

		long init = System.currentTimeMillis();
		for (int i = 0; i <= arrayListSize; i++) {
			listWithoutLimitedSize.add(stringToBeAdded);
		}
		long total = System.currentTimeMillis() - init;
		System.out.println(" Execution in " + total + " ms");

		init = System.currentTimeMillis();
		for (int i = 0; i <= arrayListSize; i++) {
			listWithLimitedSize.add(stringToBeAdded);
		}
		total = System.currentTimeMillis() - init;
		System.out.println(" Execution in " + total + " ms");
	}
}
