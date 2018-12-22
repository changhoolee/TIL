package y2018.d1219;

import java.util.Scanner;

public class Pratice01 {
	
	public static void main(String[] args) {
		
		pratice01();
	}
	
	public static void pratice01() {
		
		Scanner sc = new Scanner(System.in);	
		
		String A = sc.nextLine();
		
		String Reverse = new StringBuilder(A).reverse().toString();
		
		if(A.equals(Reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void praitice02() {
		
		// 1. 출력값을 일단 받아야 한다. Scanner()!
		
		Scanner scan = new Scanner(System.in); // 콘솔창에 입력을 하기 위해서 Scanner를 썼다.
		
		String A = scan.nextLine(); // 콘솔창에 입력 받은 값을 입력에서 끝나는게 아닌 nextLine()메소드를 이용해 데이터를 저장한다.
		
		int len = A.length(); // 이제 length의 길이를 담아 놓기 위해 A의 length() 메소드를 int타입에 len에 할당한다.
		
		// while loop문을 이용하기 앞서 입력한 데이터 값의 앞과 뒤인 변수를 할당한다.
		int front = 0; // 처음 시작하는 데이터이기에 0이라고 설정한다. 
		int back = len-1; // 원래 기존에 존재하던 데이터에서 -1한 값의 변수를 할당한다.
		while(front <= back) { // front가 back변수보다 같거나 큰 이야기는 반복문을 빠져나간다는 이야기이다.
			if(A.charAt(front)==A.charAt(back)) { 
				++front;
				--back;
			} else {
				System.out.println("No");
			}
			
		if(front > back) {
			System.out.println("Yes");
			}
		}
	}
}
