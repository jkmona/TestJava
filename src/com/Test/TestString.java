package com.Test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestString {
	public static String TEMP_PATH = "temp";
	public static void main(String[] args) throws ParseException {
		
		testSubString();
		
		System.exit(0);
	}
	
	public static void testStringReplace(){
		String t = "\\otherimg\\temp\\couponInvoice\\1486433994128.jpg";
		String r = t.replaceFirst(TEMP_PATH, "dealer").replace(TEMP_PATH, "dealer");
		System.out.println(t+":"+r);
		
		r = t.replaceFirst("\\\\temp", "").replace("/temp", "");
		System.out.println(t+":r1:"+r);
		System.out.println(t+":"+trimTempPath(t));
	}
	public static String trimTempPath(String source){
		String r = "";
		if(source != null){
			r = source.replaceFirst("\\" + TEMP_PATH, "").replace("/"+TEMP_PATH, "");
			return r;
		}
		return source;
	}
	public static void testSubString(){
		String r = "abc.bcd";
		System.out.println("abc.bcd subString(\".\")::" + r.substring(r.indexOf(".")+1));
	}
}
