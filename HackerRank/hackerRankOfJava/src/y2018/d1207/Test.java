package y2018.d1207;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Test {

	//문제 내드릴께요 :-) 
	public static void main(String[] args) {
		
		//test1();
		test2();
		

	}
	// 테스트 1 다하였습니다!
	
	// 오늘 테스트 여기까지 할께요.. ㅋㅋ 
	// 혹시 리스트 생성은 이렇게 하는게 맞나요?
	
	public static void test2() {
		//1. 콘솔에서 5개의 숫자(정수)를 배열로 입력받아서 출력하세요.
		// 입력포맷 : 1 3 5 7 9
		// 출력포맷 : 1,3,5,7,9 (한줄에 출력)  
		
		Scanner sc = new Scanner(System.in);
		
		//5개 짜리 배열 생성은 여기요 
		int [] num = new int [5];
		
		for(int i = 0; i < num.length; ++i) {
			// 이 부분이... 기억이 나질 않습니다.. 배열 부분 다시 공부해오셔야 할 것 같아요 ㅠㅠ
			//이건 이미 만들어진 배열에 값을 넣는 부분이에요 넵넵
			num[i] = sc.nextInt();
		}
		
		System.out.print(Arrays.toString(num));

		
		
	} // 55분에 시작할께요!
	
	
	
	
	
	public static void test1() {
		//1. 콘솔에서 5개의 숫자(정수)를 입력받아서, 출력하세요 
		// 입력포맷 : 1 3 5 7 9
		// 출력포맷 : 1,3,5,7,9 (한줄에 출력) 
			
		//테스트 시작! 
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			int num5 = sc.nextInt();
			System.out.println(num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5);
	}
}
