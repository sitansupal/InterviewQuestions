package com.interview.test.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Find anagrams from the list of words Two strings, and , are called anagrams
 * if they contain all the same characters in the same frequencies. For example,
 * the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 * 
 * Complete the function in the editor. If and are case-insensitive anagrams,
 * print "Anagrams"; otherwise, print "Not Anagrams" instead.
 * 
 * @author sekha
 *
 */
public class Anagrams {

	public static void main(String[] args) {
		System.out.println(isAnagram("caT","Tac"));
		System.out.println(isAnagram("caT","Tbc"));

	}

	static boolean isAnagram(String a, String b) {
		if ((a == null || b == null) || (a.length() != b.length())) {
			return false;
		}
		final char[] ARRAY_A = a.toUpperCase().toCharArray();
		final Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ARRAY_A.length; i++) {
			if (map.containsKey(ARRAY_A[i])) {
				map.put(ARRAY_A[i], (map.get(ARRAY_A[i]) + 1));
			} else {
				map.put(ARRAY_A[i], 1);
			}
		}
		final char[] ARRAY_B = b.toUpperCase().toCharArray();
		for (int i = 0; i < ARRAY_A.length; i++) {
			if (map.containsKey(ARRAY_B[i])) {
				Integer count = map.get(ARRAY_B[i]);
				if (count == 0) {
					return false;
				} else {
					count--;
					map.put(ARRAY_B[i], count);
				}
			} else {
				return false;
			}
		}
		return true;
	}

}
