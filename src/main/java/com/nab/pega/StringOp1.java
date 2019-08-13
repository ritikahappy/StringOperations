package com.nab.pega;

import java.util.ArrayList;
import java.util.List;

public class StringOp1 {

	public static void main(String[] args) {
		/*
		 * PRINT THE STRING FROM LIST
		 * 
		 * 
		 * // TODO Auto-generated method stub List<String> list = new ArrayList<>();
		 * list.add("PREETAM SINGH"); list.add("RITIKA HAPPY"); for (int i = 0; i <
		 * list.size(); i++) { String str = list.get(i); System.out.println(str); }
		 */

		List<String> list = new ArrayList<>();
		list.add("RITIKA HAPPY");
		list.add("PREETAM SINGH");
		String str = "";
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			System.out.println(str);
			int pos = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ' ') {
					pos = j;
					break;

				}
			}
			String strr = "";
			for (int k = 0; k <= pos - 1; k++) {
				strr = strr + str.charAt(k);

			}
			list1.add(strr);
			System.out.println(strr);

		}
		System.out.println(list1.get(0) + "loves" + list1.get(1));
	}
}