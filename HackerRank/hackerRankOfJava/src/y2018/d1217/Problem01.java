package y2018.d1217;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
//		question01();
		question02();
	}
	
	public static void question01() {
		
		// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
		
		// i)
		
		Scanner scan = new Scanner(System.in);
		
		String A = scan.nextLine();
		
		String Reverse = new StringBuilder(A).reverse().toString();
		
		if(A.equals(Reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
	public static void question02() {
		
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		
		scan.close();
		
		int frontWord = 0;
		
		int backWord = A.length() -1;
		
		while(frontWord <= backWord ) {
			
			if(A.charAt(frontWord) == (A.charAt(backWord))) {
				frontWord++;
				backWord--;
			} else {
				System.out.println("No");
				break;
			}
		}
		
		if(frontWord>backWord) {
			System.out.println("Yes");
		}
	}
}
//		
//		// 콘솔창에 madam이라고 할당하면 m==m, a==a 이므로 Yes 를 출력한다.
//		
//		int line = A.length();
//
//		// 배열 생성
//		
//		String [] input = new String [line];
//		// 포문 생성하기
//
//		// 
//		for(int i = 0; i < input.length; i++) {
//			
//			
//			// i)
//			// 배열의 길이 비교는 아니다! 배열에 들어있는 문자를 비교해야한다. 그러기 위해선 배열의 인덱스값을 서로 비교해야한다. 
//				// 배열의 인덱스 값은 불러오기는 하는데 처음과 끝 인덱스를 뭐라고 변수 설정을 해야 하지?
////			if(input.== input)
//			// 만약 처음 문자와 끝 문자가 같으면 처음 문자는 한 단계 올라가고 끝문자는 한 단계 낮아진다. - if문
//			// 문자가 같지 않으면 no!라고 하고 다시 scan으로 처음부터 돌아간다. - else if 문
//			// 
//				
//			// ii)
//		}
//		
//		System.out.println("Yes");
//		
//		
