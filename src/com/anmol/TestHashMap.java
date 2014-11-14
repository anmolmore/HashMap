package com.anmol;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {
	public static void main(String args[]) {		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int i = 1;
		while(i<16) {
			map.put(i, "one");
			i++;
		}
		System.out.println(map.entrySet().size());
		map.put(null, "24");
		System.out.println(map.entrySet());
		System.out.println(map);
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

}
