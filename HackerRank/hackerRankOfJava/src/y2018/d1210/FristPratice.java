package y2018.d1210;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class FristPratice {

	public static void main(String[] args) {

		pratice1();
		// pratice2();
		
	}
	
	public static void pratice1() {
		// <https://stackoverflow.com/questions/16098134/how-to-get-arraylistinteger-and-scanner-to-play-nice>
		// 일단 먼저 내가 콘솔창에 받을 값부터 설정해주는 메소드를 설정한다. Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		// 리스트의 경우 내가 사용할 List의 종류를 입력하고 <type>을 설정한 후 해당 리스트의 이름을 입력한다. = 리스트 객체를 생성해 해당 리스트에 할당한다.
		ArrayList<Integer> number = new ArrayList <>();
		
	// 첫 반복문은 콘솔창에 인덱스와 값을 설정하는 구간이다.
		// 반복 loop인 while()문 안에는 내가 반복하려는 Scanner메소드 명과 그 안에서 가능 hasNextInt()메소드를 설정한다.
		while(sc.hasNextInt()) {
		// 무엇을 반복 할 껀지 구체적으로 값을 할당한다. List의 경우 리스트명.add();해서 추가하거나 리스트명.splice();를 이용 할 수 있다.
			number.add(sc.nextInt());
		}
		
	// 인덱스 값 설정하기 
		Integer [] nums = number.toArray(new Integer [5]); // 아 toString 같은 존재군아!
		
	// 두번째 반복문은 인덱스와 값을 설정한 부분을 그릇에 담는 과정을 반복하는 구간이다.
		//
		for(int i= 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void pratice2() {
		
		// 콘솔창에 들어갈 수 있게끔 Scanner를 생성한다.
		Scanner sc = new Scanner(System.in);
		
		// int 타입이 들어있는 배열인 list명을 가지고 int[5], 5개를 생성한다.
		int [] list  = new int [5]; // 여기서 막힘요.
		
	// 배열인 list에 값을 0~4까지 반복해서 할당한다.
		// 
		for(int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(list));
	}

}
