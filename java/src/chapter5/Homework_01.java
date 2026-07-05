package chapter5;

import java.util.Random;
import java.util.Scanner;

public class Homework_01 {

	public static void main(String[] args) {
		
		//homework 01
		
	// 
	

			System.out.println("모드를 선택해주세요(1~3입력)");
			System.out.println("---------------------");
			System.out.println("1. 이지모드(기회 20회)");
			System.out.println("2. 노말모드(기회 10회)");
			System.out.println("3. 하드모드(기회 5회)");
			System.out.println("---------------------");
			
			Scanner sc = new Scanner(System.in);
			int mode = sc.nextInt();

			if (mode == 1) {
			System.out.println("이지모드를 선택하셨습니다.");
			
		}else if (mode == 2){
			System.out.println("노말모드를 선택하셨습니다.");
			
		}else if (mode == 3) {
			System.out.println("하드모드를 선택하셨습니다.");	
			
		}else {
			System.out.println("모드가 아닌 다른 번호를 선택하셨습니다.");
			System.out.println("모드에 해당하는 숫자를 입력해주세요.");
		}
	
	
			Random r = new Random(); // 랜덤 숫자 뽑기 위한 셋팅
			
			//야구게임 숫자 4개 (아직 중복제거 없음)
			
			int numarr[] = new int[4]; // 4칸짜리 빈 배열
			int inputnum[] = new int[4]; // 사용자가 입력할 4칸짜리 빈 배열
			for (int i = 0; i < 4; i++) {
				numarr[i] = r.nextInt(0,9);
				System.out.println("numarr[" + i + "] : " + numarr[i]);
			}
			System.out.println("중복되지 않는 0~9까지 4자리 수를 입력해주세요.");
			int c = 0;
			//스트라이크 개수 카운트용
			int d = 0;
			//볼 개수 카운트용
			for (int i = 0; i < 4; i++) {
			for (int a = 0; a < 4; a++) {
			inputnum[a] = sc.nextInt();
			System.out.println("inputnum[" + a + "] : " + inputnum[a]);
			if(numarr[i] == inputnum[a]) { if (i == a) { c++;
			}else { d++;	
			}
			
		}	
				
		}System.out.println("Strike : " + c + " Ball : " + d);
		}
			//System.out.println("Strike : " + c + "Ball : " + d);
	}
}
			

		
	


