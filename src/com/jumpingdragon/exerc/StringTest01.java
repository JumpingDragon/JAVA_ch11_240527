package com.jumpingdragon.exerc;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Korea"; // 자바의 문자열 선언
		String str2 = new String("Korea");
		
		System.out.println(str1.charAt(2)); // charAt 문자열에서 글자 한 글자를 뽑아낼 때 인덱스 쓰면 됨.
		
		int[] intArray = {1,2,3,4,5};
		
//		String str3 = new String(intArray); // 에러 발생
		
		int a = 10;
		
//		String str3 = new String(a); // 에러 발생
		
		byte[] byteArray = {72, 101, 108, 108, 111}; //ASCII 코드
		String str4 = new String(byteArray);// int는 안 되고 byte는 가능
		// 1byte는 8bit 니까 String 커버 가능.
		
		System.out.println(str4);
		
		String str5 = new String(byteArray, 2, 3); // byteArray 배열 안에서 인덱스 2부터 3개를 찍으라는 뜻
		System.out.println(str5);
		
		
		String str6 = "자바프로그래밍";
		int a2 = str6.indexOf("프");
		System.out.println(a2);
		int a3 = str6.indexOf("그래");
		System.out.println(a3); // 문자열의 첫글자의 인덱스 출력
		int a4 = str6.indexOf("왕자");
		System.out.println(a4);// 해당 문자가 문자열에 없으면 무조건 -1 반환
		
		if (str6.indexOf("푸로") != -1) { // 참이면 해당 문자열이 존재하는 경우
			
		} else { // 해당 문자열이 존재하지 않는 경우
			
		}
	}

}
