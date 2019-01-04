package y2019.d0104;

public class Pratice04 {
	
//	static int i = 5; // 전역변수
	
	static void a() {
		int i  = 10;
//		b();
	}
	
	static void b() {
//		int i = 30; // 만약 b메소드 안에 지역변수가 없다면 클래스의 전역 변수를 끌어다쓴다.
//		System.out.println(i); // 전역변수 사용
	}
	
	public static void main(String[] args) { 
		
		int i = 1;
		
		a();
	}
}