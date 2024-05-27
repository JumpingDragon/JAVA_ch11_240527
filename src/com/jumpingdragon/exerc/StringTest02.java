package com.jumpingdragon.exerc;

public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "오늘은 자바 프로그래밍!!";
		
		String str2 = str1.replace("자바", "파이썬");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1.replace("java", "파이썬"); //한영은 인식 못함. 못 바꿈.
		System.out.println(str3);
		
		String ssn = "880815-1234567"; // ssn[7:]
		System.out.println(ssn.substring(7)); //인덱스7부터 끝까지를 가져옴.
		System.out.println(ssn.substring(7,9));//ssn[7:9] 파이썬의 slicing과 같다.
		
		String no1 = "10";
		String no2 = "3.14";
		
		int num1 = Integer.parseInt(no1); // 문자열-> 정수
		double num2 = Double.parseDouble(no2); // 문자열 -> 실수
		
//		System.out.println(no1/2);
		System.out.println(num1/2);
		System.out.println(num2);
		
		int val1 = 112;
		String strVal1 = String.valueOf(val1); // 정수-> 문자열
		System.out.println(strVal1);
		
		double val2 = 3.141592;
		String strVal2 = String.valueOf(val2); // 실수 -> 문자열
		System.out.println(strVal2);
		
	}

}
