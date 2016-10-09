package com.Test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date dt = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//format
		Calendar cld = Calendar.getInstance();
		cld.setTime(dt);
		cld.add(Calendar.DAY_OF_MONTH, -1);
		
		Date dt1 = cld.getTime();
		System.out.println(format.format(dt1));
		System.out.println(format2.format(dt1));
		
		dt1.setTime(1465285728000L);
		
		System.out.println(format.format(dt1));
		
		System.out.println(format.parse("2016-06-10 15:12:12"));
		System.out.println(format2.parse("2016-06-10 15:12:12"));
		
		System.out.println(format.parse("2016-06-10"));
		System.out.println(format2.parse("2016-06-10"));
	}

}
