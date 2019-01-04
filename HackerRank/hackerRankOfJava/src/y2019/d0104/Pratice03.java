package y2019.d0104;
 
class Carculator { //  static은 static만 할당이 가능하다. 쓰고 싶지 않으면 만들고자 하는 객체를 main 클래스 밖으로 보내자.
		
		static double PI = 3.14; // static을 씀으로써 클래스 변수가 된다. =! final double PI...;
		static int base = 0; // 굳이 또 다른 인스턴스 생성 없는 값을 인스턴스에 저장하고자 할 때
//		int left;
//		int right;
	
//	public void valuePocket(int left, int right) {
//		
//		this.left = left;
//		this.right = right;
//		
//	}
	
	public static void cal_sum(int left, int right) {
		
		System.out.println(left + right + base);
	}
	
	
//	public void cal_avg() {
//		System.out.println((this.left + this.left)/2);
//	}
}
	
public class Pratice03 {
	
	
	
	public static void main(String[] args) {
		
//		1. 클래스 설정하기
//		1-1 클래스명 설정하기
//		1-2 전역 변수 설정하기
//		1-3 임의의 클래스 내에 연산하고자 하는 메소드 출력하기 
		
//		2. main에 해당 클래스 연산 불러오기
//		2-1 인스턴스를 생성하고 c1이라는 변수를 설정한다.
		Carculator c1 = new Carculator();
//		c1.valuePocket(30, 40);
		
//		c1.base = 10; // 클래스 변수와 인스턴스 변수가 동시에 사용되는 경우
		
		c1.cal_sum(30, 40);
//		c1.cal_avg();
	}
}
