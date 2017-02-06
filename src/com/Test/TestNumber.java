package com.Test;
import java.text.DecimalFormat;
import java.util.*;

public class TestNumber {

	public static void main(String[] args) {
		long m = System.currentTimeMillis();
		long d = System.currentTimeMillis()/1000;
		DecimalFormat df = new DecimalFormat("#");
		String s = df.format(d);
		System.out.println("m:"+m);
		System.out.println("s:"+s);
		Integer i = null;
		System.out.println("equal:"+(1 == new Integer(1)));
		System.out.println("equal:"+(1 == new Integer(4)));
		
		System.exit(0);
		
		
	}

}
