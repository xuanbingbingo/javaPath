package com.bingo.listDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		Notice notice1 = new Notice(1,"����Ա1���","����Ա1",new Date());
		Notice notice2 = new Notice(2,"����Ա2���","����Ա2",new Date());
		Notice notice3 = new Notice(3,"����Ա3���","����Ա3",new Date());
		
		ArrayList tempArr = new ArrayList();
		tempArr.add(notice1);
		tempArr.add(notice2);
		tempArr.add(notice3);
		
		Notice notice4 = new Notice(4,"����Ա4���","����Ա4",new Date());
		tempArr.add(1,notice4);
		tempArr.remove(1);
		notice1.setTitle("heheheheheh");
		System.out.println(((Notice) tempArr.get(0)).getTitle());
	}

}
