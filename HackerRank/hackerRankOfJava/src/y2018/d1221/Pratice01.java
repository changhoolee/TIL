package y2018.d1221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pratice01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Scanner 대신 BufferdReader를 생성 했다. BufferedReader 메소드는 InputStreamReader를 할당하고 System.in을 생성한다.
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 read는 앞서 BufferedReader의 InputStreamReader를 생성했기에 
		// Integer타입으로 형변환 한다.
		int read = Integer.parseInt(rd.readLine());
		
		// 정수형 타입의 배열 pointArr를 생성했는데 배열은 read의 갯수에 맞춰 생성한다.
		int pointArr[] = new int [read];
		
		// 문자형 타입의 배열 arr을 생성했는데 read의 갯수에 맞춰 생성한다.
		String arr[] = new String[read];
		
		// 
		for(int i = 0; i < read; i++) {
			int point = 0;
			arr[i] = rd.readLine();
			int pointCount[] = new int[arr[i].length()];
			
			// 
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j)=='X') {
					point = 0;
				} else {
					point++;
					pointCount[j] = point;
				}
			}
			
			//
			int sum = 0;
			for(int j =0; j<pointCount.length; j++) {
				sum += pointCount[j];
			}
			pointArr[i] = sum;
		}
		
		for(int i = 0; i < pointArr.length; ++i) {
			System.out.println(pointArr[i]);
		}
		
//		Scanner scan = new Scanner (System.in);
//		
//		int amount = scan.nextInt();
//		
//		// scan, 내가 콘솔창에 친 정수값이 문자열로 받는 변수도 만든다.
//		scan.nextLine();
//		
//		// 
//		for(int i = 0; i < amount; i++) {
//			
//			String input = scan.nextLine();
//			int result = 0;
//			int score = 0;
//			
//			for(int j = 0; j < input.length(); j++) {
//				if(input.charAt(j)=='O') {
//					score++;
//					result += score;
//				} else {
//					score=0;
//				}
//			}
//			System.out.println(result);
//		}
	}

}
