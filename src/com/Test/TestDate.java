package com.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 00:00:00.000");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd 23:59:59.997");
		//format
		Calendar cld = Calendar.getInstance();
		cld.setTime(dt);
		cld.add(Calendar.DAY_OF_MONTH, -1);
		
		Date dt1 = cld.getTime();
		System.out.println(format.format(dt1));
		System.out.println(format2.format(dt1));
		
	}

}
