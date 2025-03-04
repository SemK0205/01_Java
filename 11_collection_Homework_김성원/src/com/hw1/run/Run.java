package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		Friend f = new Friend();
		
		List<Friend> fd = new ArrayList<Friend>();
		
		fd.add(new Friend("짱구"));
		fd.add(new Friend("철수"));
		fd.add(new Friend("유리"));
		fd.add(new Friend("훈이"));
		fd.add(new Friend("맹구"));
		
		int random = (int)(Math.random()*4);
		
		fd.get(random).pickLeader();
		
		
		
	}

}
