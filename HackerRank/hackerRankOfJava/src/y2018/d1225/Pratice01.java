package y2018.d1225;

import java.util.ArrayList;
import java.util.Scanner;

public class Pratice01 {
	
	public static void main(String[] args) {
		
		
		// pratice01();
		pratice02();
	}
	

 public static void pratice01() {
	 
	 /*
	 배열로 1,2,3,4,5,6 만들어보기
	 */
	 
	 // 1.변수 설정하기
	 
	 int [] list = new int [10];
//	 System.out.println(list.length);
	 
	 // 2.입력하기
	 // 2-1 for문을 이용해 scan을 배열에 집어넣기
	 Scanner scan = new Scanner(System.in);
	 
	 for(int i = 0; i < list.length; i++) {
		 list[i] = scan.nextInt();
	 }
	 
	 // 3.출력하기
	 // 3-1 for문을 이용해서 scan값과 ,을 출력한다. 
	 // 3-2 마지막 , 9번째 인덱스 값에서 ,이 출력이 되면 안되는데...?
	 // 3-2-1 if문의 length의 [9]이면 list[j]의 값만 출력하고 ", "의 값은 출력 X
	 System.out.print("입력하는 값은 : ");
	 for(int j = 0; j < list.length; j++) {
		System.out.print(list[j] + ", ");
	 }
	 // 배열과 리스트의 메모리 저장 구조 및 방식을 잘 못 이해한듯???
	}
 
 	public static void pratice02() {
 		
 		/*
 		리스트로 1 2 4 5 3 2 41 2 1 2 만들어보기
 		*/
 		
 		// 1. 변수 설정하기
 		ArrayList <Integer> list = new ArrayList  <> ();
 		int SIZE = 10; // ArrayList <Integer> list = new ArrayList <> (10);와 어떤 차이가 있는걸까?  
 		
 		// 2. 리스트 입력하기
 		Scanner scan = new Scanner(System.in);
 		
 		for(int i = 0; i < SIZE; i++) {
 			list.add(scan.nextInt()); //
 		}
 		
 		// 3. 리스트 출력하기
 		System.out.print("입력하고자 하는 값은 : ");
 		
 		for(int i = 0; i < SIZE-1; i++) {
 			System.out.print(list.get(i)+ ", ");
 		}
 		
 		System.out.print(list.get(SIZE-1));
 	}
}