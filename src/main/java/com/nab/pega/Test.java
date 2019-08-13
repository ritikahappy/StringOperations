package com.nab.pega;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("add");
		list.add("sub");
		list.add("mul");
		list.add("div");
		String str = "";
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		str = str+list.get(i);
		
       
		}
		
		System.out.println(str);
	}

}
