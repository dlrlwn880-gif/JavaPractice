package chapter4;

public class practice3 {

	public static void main(String[] args) {
		
		/*
		 *     *
		 *     **
		 *     ***
		 *     ****
		 *     *****
		 */
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for(int a = 1; a <= 5; a++) {
			for(int b = 5; b >= a; b--) {
				System.out.print("*");
			}
		     System.out.println();
		}
		/* 
		 *     *
		 *    *** 
		 *   *****
		 *  *******
		 * *********
		 * 
		 *  d에 증감식 대입하려면 d=+2 이런식으로 수식대입. 
		 * 
		 */
		
		for(int c = 1; c <= 5; c++) {
			for(int d = 5; d >= c; d--) {
				System.out.print(" ");
	}		for(int d = 1; d <= c; d++) {
		System.out.print("*");
	}
			for(int d = 1; d <= c - 1; d++) {
		System.out.print("*");
	}
			System.out.println();
		}
		/* 
		 * *********   
		 *  ******* 
		 *   *****  
		 *    ***
		 *     *				 
		 */
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
