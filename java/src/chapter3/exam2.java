package chapter3;

public class exam2 {

	public static void main(String[] args) {
		
//1		
		int b = 5;
		b = -b;
		int result = 10 / b;
		System.out.println(result);
//2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
//4
		int pencils = 534;
		int students = 30;
		// 학생1명이 가지는 연필 수 
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수
		int pencilLeft = (pencils % students);
		System.out.println(pencilLeft);
//5
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
//7		
		int value = 356;
		System.out.println(value);
//8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
	
//9
		
		
	}
	

}
