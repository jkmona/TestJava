package com.Test;

import java.util.*;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List waigSortList=new ArrayList();
		waigSortList.add("1622");
		waigSortList.add("1620");
		waigSortList.add("1626");
		waigSortList.add("1608");
		Collections.sort(waigSortList);
		for(Object o : waigSortList){
			System.out.println(o);
		}
	}

}
