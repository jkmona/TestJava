package com.Test;

import java.util.List;

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
		Integer i = 1212;
		System.out.println("aa" + i);
		
		System.out.println("aa" + null);
		
		System.out.println(String. format("a=%s", null));
		
		System.out.println(String. format("a=%s", "12312"));
		System.out.println(String. format("a=%s", 12312));
		System.out.println(String. format("a=%d", 12312));
		
		Integer strId;
		// strId = Integer.parseInt("");
		//System.out.println("parseInt(\"\")"+strId);
		//strId = Integer.parseInt("012f");
		//System.out.println("parseInt(null)::" + strId);
		
		/*
		空指针错误
		List<String> list = null;
		for(String str1 : list){
			System.out.println("str:" + str1);
		}*/
		
		
		
	}

}
