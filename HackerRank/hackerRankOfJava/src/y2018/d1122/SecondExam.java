package y2018.d1122;

import java.util.Scanner;

public class SecondExam {

	public static void main(String[] args) {
		/*
		 사용자로부터 5개의 정수를 입력받아 정렬하며, 그 과정 출력하기 => 1 3 5 7 9 
		 아래와 같이, ‘입력 값 중 가장 작은 숫자’를 ‘첫번째 위치’의 값과 교환하는 방법을 사용한다. => 선택정렬
		 */
		
		// step1. 다섯개의 정수를 콘솔창에 입력한다.
		// step2. 
		Scanner sc = new Scanner(System.in);
		// 5개 숫자 배열 선언하기
		int[] num = new int [5]; //5개짜리 배열을 선언
		//System.out.println(num.toString());
		
		//5개의 숫자 입력받기
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int minNumber = num[0];
		int index = 0;
		
		// 정렬하기
		for(int i= 0; i<num.length; i++) {
			System.out.println(minNumber+" <-> "+num[i]);
			if(minNumber > num[i] ) {
				System.out.println("==>"+minNumber+" > "+num[i]);
				minNumber = num[i];
				index = i;
			}	
						
		}
		// 작은 수와 첫번째 자리 수 교환하기
		int temp = num[0];
		num[0] = minNumber;
		num[index] = temp;
		
		//5개의 숫자 입력받기
				for(int i = 0; i < num.length; i++) {
					System.out.print(num[i]+" ");
				}
				
		// 내가 콘솔창에 입력한 값들을 배열에 집어넣는다?
		// [0] - 1,[1] - 3,[2] - 5,[3] - 7,[4] - 9
		
		// 배열을 바로 if문으로 대소비교를 한다? 바깥에서 안 순으로

//3 5 7 9 1
		
//1 5 7 9 3
//1 3 7 9 5
//1 3 5 9 7
//1 3 5 7 9 
	}
}