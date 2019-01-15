package y2019.d0115;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		review();
	}
	
	public static void review() {
		
		// 숫자가 5개인 배열을 생성하자.
		
		int [] list = new int [5];
		
//		1. 콘솔창에 칠 값을 쓰는 데이터 설정하기
		Scanner scan = new Scanner(System.in);
		
//		2. 배열에 내가 콘솔창에 친 값을 입력 저장하는 형태 만들기
		for(int i = 0; i < list.length; i++) {
			list [i] = scan.nextInt();
		}
		
//		3. 배열에 넣은 데이터 값을 출력하기
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
