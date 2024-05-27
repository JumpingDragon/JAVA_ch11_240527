package com.jumpingdragon.exerc;

public class SystemTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int로 쓰면 에러 발생함.
		long a = System.nanoTime(); // 현재시간을 나노단위 1/10e9초
		long b = System.currentTimeMillis();// 현재시간을 1/1000초
		
//		System.out.println(a);
//		System.out.println(b);
		
		long t1 = System.currentTimeMillis(); //start time
		long n1 = System.nanoTime(); //start time
		
		int sum=0;
		for(int i=0;i<=10000000;i++) {// 1~10000000까지의 합
			sum = sum + i;
		}
		
		long t2 = System.currentTimeMillis(); // end time
		long n2 = System.nanoTime();
		
		System.out.println(t2-t1); // 1~10000000까지의 합을 구하는데 걸린 시간
		System.out.println(n2-n1); // 1~10000000까지의 합을 구하는데 걸린 시간
	}

}
