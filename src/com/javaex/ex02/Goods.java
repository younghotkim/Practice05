package com.javaex.ex02;

public class Goods {
	
	private String name;
	private int price;
	
	public Goods() {
		//게터세터를 통해서 필드 접근이 허용되도록 디폴트 생산자를 입력
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) { 
	//setname에 접근이 가능하도록 private-->public
		this.name = name;	
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}

	
	
}




