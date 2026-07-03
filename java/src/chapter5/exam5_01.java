package chapter5;

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
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		//int num1 =1 , num2 = 2 , num3 = 3, num4 = 4, num5, num6, num7,num8, num9, num10;
		int num[] = {1561, 1562, 3789, 4654, 5456, 7896, 1237, 4568, 6449, 7810};
		int numarr[] = {};
		for(int i = 0; i<10; i++)
		System.out.println("num[" + i + "]:" + num[i]);
		
	}

}
