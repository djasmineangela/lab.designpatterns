package com.bootcamp.lab.designpatterns.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class TensValue {
	private final static Map<Integer, String> tensWordValue = new HashMap<Integer, String>() {
		{
			put(2, "twenty");
			put(3, "thirty");
			put(4, "forty");
			put(5, "fifty");
			put(6, "sixty");
			put(7, "seventy");
			put(8, "eighty");
			put(9, "ninety");
		}
	};

	public static String getWordValue(int numberofPlaceValue) {
		for (Integer key : tensWordValue.keySet()) {
			if (numberofPlaceValue == key) {
				return tensWordValue.get(key);
			}
		}
		return "";
	}
}
