package chapter2;

public class exam01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		int sum2 = (a * 10) + (b + 3);
		
		a = 50;
		
		sum= a + b;
		
		//System.out.println("sum : " + sum);
		
		int x = 3;
		int y = 5;
		//System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		//
		System.out.println("x:" + x + ", y:" + y);
		
	
		byte bt1 = 100;
		byte bt2 = -100;
		short st1 = 128; 
		short st2 = 30000;
		int it1 = 150000;
		int it2 = 95000000;
		int it3 = 43000000;
		
		long lnl = 100000000000L
		;
		String str = "I Like Apple";
		
		System.out.println(str);
		
		String name = "이기주";
		String job = "학생";
		
		String str1 = "제 이름은 " + name + " 이고요, 직업은 " + job + "입니다.";
		System.out.println(str1);
		
		int num1;
		float num2;
		num1 = 10;
		num2 = 4.7f;
		//int div = num1 / num2;
		float div = num1 * num2;
		
		double db1 = 3.14;
		double db2 = 7.5;
		
		double dbsum = db1 + db2;
		
		System.out.println(dbsum);
		
		
		
		
	}

}
