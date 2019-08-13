package com.nab.pega;

import java.util.ArrayList;
import java.util.List;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Preetam Singh");
		list.add("Ritika Happy");
		list.add("Nishit Raj");
		list.add("Jagmeet Singh");
		list.add("Ranjit Singh");

		/*
		 * String str =""; for(int i=0;i<list.size();i++) { int pos =0; str =
		 * list.get(i); for(int j=0;j<str.length();j++) { if(str.charAt(j)==' ') { pos =
		 * j; break; }
		 * 
		 * } String output = str.charAt(0)+""+ str.charAt(pos+1);
		 * System.out.println(output); }
		 * 
		 */

		String str = "";
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			String local ="";
			for (int j = 0; j < str.length(); j++) {
				int count = 1;
				char c = str.charAt(j);
				
				if (!local.contains(c+"")) {
					local = local+c;
					for (int k = j + 1; k < str.length(); k++) {
						if (c == str.charAt(k)) {
							count++;

						}
					}
					System.out.println(c + ":" + count);
				}
				
			}
		}

	}
}
