package com.javaex.ex01;

public class Member {
	
	private String id;
	private String name;
	private int point;

	
	public String getId() {
		
		return id;
		
	}
	
	public void setId(String id) {
		
		this.id=id;
		
	}

	public int getPoint() {
		
		return point;
	}
	

	public void setPoint(int point) {
	
		this.point = point;
		
	}

	public String getName() {
		
		return name;
	
	}

	public void setName(String name) {
	
		this.name = name;

	}
	
	public void showInfo() {
		
		System.out.println("회원정보: " + name + "(" + id + ")," + point + "점");
		
	}
	
	
	
	
	
	
}
