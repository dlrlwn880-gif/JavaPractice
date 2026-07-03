package chapter4;

public class exam04 {

	public static void main(String[] args) {
		//i는 단수(2단~9단)
		for(int i = 2; i <= 9; i++)
	//       1            2 
			//j는i단의 곱해지는 수(1~9)
			for(int j = 1; j <=9; j++) {       //반복문
	//		     3           4 7   6             5
				//System.out.println(i + "x" + j + "=" + (i * j));
				//System.out.printf("%d x %d = %d\n", i, j, i*j);
				System.out.println("i : " + i + " / j : " + j);
			}
	}

}
