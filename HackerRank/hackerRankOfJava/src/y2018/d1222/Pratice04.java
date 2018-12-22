package y2018.d1222;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratice04 {
	
	public static void main(String[] args) {
		/*
		안녕 하세요 나는 이창호 에요 를 안녕.하세요.나는.이창호.에요.이 나오게 출력하라.
		그리고 그 값의 길이를 구해라.
		*/
		
		// 1. 변수 설정하기
		
		ArrayList <String> line = new ArrayList <> ();
		
		int SIZE = 5;
		// 2. 콘솔에 입력하기
		
		Scanner scan = new Scanner(System.in);
		for(int i =0; i < SIZE; i++) {
			line.add(scan.next());
		}
		
		// 3. 출력하기
		System.out.print("입력하고자 하는 값 : " );
		for(int i = 0; i < SIZE-1; i++) {
			System.out.print(line.get(i)+", ");
		}
		System.out.print(line.get(SIZE-1));
	}
}
