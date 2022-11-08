package com.learn.opp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> participants=new ArrayList<>();
    participants.add("ajay");
    participants.add("kumar");
    participants.add("shiva");
    participants.add("harish");
    participants.add("pranay");
    participants.add(2,"akhil");
    Iterator itr=participants.iterator();
    while(itr.hasNext())
    System.out.println(itr.next());
	}

}
