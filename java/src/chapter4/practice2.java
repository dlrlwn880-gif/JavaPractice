package chapter4;

public class practice2 {

	public static void main(String[] args) {
		
		int a=2, b=-3, c=5, d=-7, e=11; 
		// 정수형으로 표현하기위해 int형을 사용하고 a,b,c,d,e값 지정
		double d1, d2, d3, d4, d5;
		// 소수점(실수형)으로 표현하기위해 double 을 사용
		d1 = a/b/c;
		/*
		 * 1) a/b : 0(자바에서는 정수형끼리 계산하면 정수형만 표현할수있음)
		 * 2)위의 결과값/5 : 0  
		 * 3)결과값: 0.0
		 */
		d2 = 7+c*--d/e;

		/*
		 *1) --d (증감부호가 가장 앞 순서) : -8
		 *2) 5*(-8) = -40 (산술기호 곰셈 나눗셈이 다음)  
		 *3) -40/11 =-3 (-3.6...이나 정수형이라 정수형표현)
		 *4) 7-3 = 4
		 *
		 */
		d3 = 2*a%-b+c+1;
		/*
		 *0) -b 부호먼저 -> -(-3)
		 *1)2*2=4
		 *2)4%3 = 1  
		 *3)1+5+1 =7
		 */
		d4 = 39/-++e-+29%c;
		/*
		 *1)++e = 12
		 *2)39/-12= -3
		 *3)29%5=4
		 *4)-3-4=-7
		 */
		d5 = a+=b+=c+=1+2;
		/*1+2=3 3을 c에 더함 :5+3 =8
		 *b에 8을 더함 : -3+5=5
		 *a에 5를 더함 : 2+5=7
		 * 
		 */
		
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("d3 : " + d3);
		System.out.println("d4 : " + d4);
		System.out.println("d5 : " + d5);	
		
		
		
	}

}
