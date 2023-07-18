package com.scalar.introProbSolve;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SmallerAndGreater {
	public int solve(ArrayList<Integer> A) {
		List<Integer> sortedList = A.stream().sorted().collect(Collectors.toList());
		Integer smaller = sortedList.get(0);
		Integer larger = sortedList.get(sortedList.size() - 1);
		int middle = 0;
		for (Integer i = 0; i < A.size(); i++) {
			if (A.get(i) > smaller && A.get(i) < larger) {
				middle++;
			}
		}
		return middle;
	}
}
