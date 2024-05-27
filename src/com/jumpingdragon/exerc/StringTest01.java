package com.jumpingdragon.exerc;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Korea"; // 자바의 문자열 선언
		String str2 = new String("Korea");
		
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
	}

}
