package com.Test;

public class TestConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = null;
		String str = String.valueOf(obj);
		System.out.println(str instanceof String);
		System.out.println(str + "");
		
		str = (String)obj;
		System.out.println(str instanceof String);
		System.out.println(str + "");
		
		Long l = (Long)obj;
		System.out.println(l instanceof Long);
	}

}
