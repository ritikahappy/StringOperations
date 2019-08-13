package com.nab.pega;

public class StringOp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Preetam Singh";
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
			
		}
		System.out.println(s);
	}

}
