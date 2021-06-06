package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
 
        for (int i=0; i<friendArray.length; i++) {
        	
        	System.out.print("이름: ");
        	String name = sc.nextLine();
        	        	
        	System.out.print("핸드폰: ");
        	String hp = sc.nextLine();
        	
        	System.out.print("학교: ");
        	String school = sc.nextLine();
        	
        	System.out.println("--------------------");
        	
        
        
        Friend friend = new Friend();
        
        friend.setName(name);
        
        friend.setHp(hp);
        
        friend.setSchool(school);
        
        friendArray[i] = friend;
        
        
        }
        

        
        //친구정보 3명 입력 로직 --> 반복문 사용
            
        	// 친구정보(이름) 입력받기

        	// 친구정보(핸드폰) 입력받기
        
        	// 친구정보(학교) 입력받기

            // Friend 인스턴스 생성하여 데이터 넣기

            // 인스턴스 주소를 배열에 대입

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
           friendArray[i].showInfo();
        	}

        sc.close();
    }

}
