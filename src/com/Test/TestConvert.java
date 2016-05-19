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
		
		System.out.println("\\%s:" + String. format("a=%s", null));
	}

}
