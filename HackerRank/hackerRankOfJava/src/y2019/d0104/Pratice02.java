package y2019.d0104;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pratice02 {
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	
	public static void main(String[] args) {
		
		pratice01();
		sum (30, 40);
	}
	
	public static void pratice01() {
		
//		1. File 클래스를 할당한다.
//		2. 경로가 System.in이 아닌 out.txt로 변경해준다.
		try {
			File file  = new File("out.txt"); // 클래스 File 인 file은 객체인 File을 생성하고 이는 out.txt 파일을 할당한다.
			Scanner scan = new Scanner(file); // 클래스 Scanner 인 scan은 객체인 Scanner를 생성하고 이는 file을 할당한다. 
			int SIZE = 10; 
			for(int i = 0; i < SIZE; i++) {
				System.out.println(scan.nextInt()*1000); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		
//		3.
	}
}
