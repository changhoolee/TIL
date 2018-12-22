package y2018.d1222;

import java.util.Scanner;

public class Pratice05 {
	public static void main(String[] args) {
			
//			문제 1) 다음과 같이 출력포맷을 만들어 주세요 
//			입력 하는 수 1 2 4 5 3 2 41 2 1 2
//			입력받은 숫자의 갯수 : 10개 
//			입력 받는 수 : 1,2,4,5,3,2,41,2,1,2
//			
			// 1. 10개의 정수를 입력받는다.
			// 1-1 Scanner 를 통해서 입력받는다.
			Scanner scan = new Scanner(System.in);
			// 1-2 포문을 이용해 10개를 입력 받는다.
			// 1-2-1 배열을 이용한다.
			int [] list = new int [10];
			// 1-2-2 배열을 이용해 포문을 돌려 총 10개를 입력 받는다.
			for(int i = 0; i < list.length; i++) {
				list[i] = scan.nextInt();
			}
			// 2. 포맷에 따라 출력한다.
			// 2-1 갯수 출력하기
			System.out.println("입력한 총 갯수는 :" + list.length);
			// 2-2 for문을 통해 리스트를 출력한다.			
			
			System.out.print("입력하고자 하는 수는 :");
			for(int i = 0; i < list.length; i++) {
				System.out.print(list[i] + ", ");
			}
	}
}
