package chapter5;

import java.util.Random;

public class exam5_01 {

	public static void main(String[] args) {
		String  str1 = "Hello";
		String  str2 = "Hello World";
//		
//		String[] str3 = str2.split(" ");
//		System.out.println("str1 : " + str1);
//		System.out.println("str3 [0] : " + str3 [0]);
//		
//		System.out.println(str1 == str3[0]);

		/*
		 *배열: 같은 타입의 변수를 여러개 선언하고 싶을때 사용
		 * -> 같은타입의 변수를 여러개 묶은 데이터 뭉치
		 * 순서는 항상 0 부터 시작
		 * 
		 * 
		 * 
		 * 
		 */
		//int num1 =1 , num2 = 2 , num3 = 3, num4 = 4, num5, num6, num7,num8, num9, num10;
		int num[] = {1561, 1562, 3789, 4654, 5456, 7896, 1237, 4568, 6449, 7810};
		int numarr[] = new int[4];//4칸짜리 빈 배열
//		for(int i = 0; i<10; i++)
//		System.out.println("num[" + i + "]:" + num[i]);
//		
//		String strarr[] = {"hello","apple", "Computer", "Java"};
//		for(int i = 0; i < 4; i++) {
//			System.out.println("strarr[" + i + "] : " + strarr[i]);
//			
//		}
	
		Random r = new Random();
		for (int i = 0; i < 4; i++) {
			numarr[i] = r.nextInt(0,9);
			System.out.println("numarr[" + i + "] : " + numarr[i]);
		}
			
		
	
	
	
	}
	

}
