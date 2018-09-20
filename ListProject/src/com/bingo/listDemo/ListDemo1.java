package com.bingo.listDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] strArr = {"1","2","3","4"};
//		StringBuffer b = new StringBuffer("adbc");
//		List list = new ArrayList();
//		list.add("a");
//		list.add("2.2");
//		list.add("3");
//		list.remove(1);
//		System.out.println(list);
		Notice notice1 = new Notice(1,"管理员1你好","管理员1",new Date());
		Notice notice2 = new Notice(2,"管理员2你好","管理员2",new Date());
		Notice notice3 = new Notice(3,"管理员3你好","管理员3",new Date());
		
		ArrayList tempArr = new ArrayList();
		tempArr.add(notice1);
		tempArr.add(notice2);
		tempArr.add(notice3);
		
		Notice notice4 = new Notice(4,"管理员4你好","管理员4",new Date());
		tempArr.add(1,notice4);
		tempArr.remove(1);
		notice1.setTitle("heheheheheh");
		System.out.println(((Notice) tempArr.get(0)).getTitle());
		
		
		
		Set<Notice> set = new HashSet();
		set.addAll(tempArr);
		System.out.println(set);
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
		System.out.println("=========================");
		
		Map<String,String> animal = new HashMap<String,String>();
		animal.put("a", "b");
		animal.put("aa", "bb");
		Iterator<String> ite = animal.values().iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		Iterator ite2 = animal.entrySet().iterator();
		while(ite2.hasNext()){
			System.out.println(ite2.next());
		}
		Iterator ite3 = animal.keySet().iterator();
		while(ite3.hasNext()){
			String s = (String) ite3.next();
			System.out.println(s+","+animal.get(s));
		}
		System.out.println("=========================");
		
		Map<String,Notice> hehe = new HashMap<String,Notice>();
		hehe.put("a", notice1);
		hehe.put("aa", notice2);
		System.out.println(hehe.get("a"));
		Iterator<Notice> hehe1 = hehe.values().iterator();
		while(hehe1.hasNext()){
			System.out.println(hehe1.next());
		}
		Set<Entry<String,Notice>> keyValue = hehe.entrySet();
		for (Entry<String,Notice> entry : keyValue) {
			System.out.println("woqu"+entry.getKey());
			System.out.println("woqu"+entry.getValue());
		}
		Iterator hehe2 = hehe.entrySet().iterator();
		while(hehe2.hasNext()){
			System.out.println(hehe2.next());
		}
		Iterator<String> hehe3 = hehe.keySet().iterator();
		while(hehe3.hasNext()){
			String s = (String) hehe3.next();
			System.out.println(s+","+hehe.get(s));
		}
		
		
		
		
		
	}

}
