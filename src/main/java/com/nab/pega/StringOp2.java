package com.nab.pega;

import java.util.ArrayList;
import java.util.List;

public class StringOp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Ritika");
		list.add("Preetam");
		String str = "";
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			System.out.println(str);
			String strr = "";
			for (int j = 0; j < str.length(); j++) {
				strr = strr + str.charAt(j);
				System.out.println(strr);
			}
		}

	}

}
