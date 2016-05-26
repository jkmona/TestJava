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
		String s = null;
		System.out.println(s + "asdf");
		
		System.out.println(String. format("a=%s", null));
		
		System.out.println(String. format("a=%s", "12312"));
		System.out.println(String. format("a=%s", 12312));
		System.out.println(String. format("a=%d", 12312));
	}

}
