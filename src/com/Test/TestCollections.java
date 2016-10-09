package com.Test;

import java.util.*;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> waigSortList=new ArrayList<String>();
		waigSortList.add("1622");
		waigSortList.add("1620");
		waigSortList.add("1626");
		waigSortList.add("1608");
		Collections.sort(waigSortList);
		for(Object o : waigSortList){
			System.out.println(o);
		}
		
		List<Integer> aList= new ArrayList<Integer>();
		aList.add(1622);
		aList.add(1620);
		aList.add(1626);
		aList.add(1608);
		String[] strAry = waigSortList.toArray(new String[0]);
		
		for(String s : strAry){
			System.out.println(s);
		}
		
		aList.toArray(new String[0]);
	}

}
