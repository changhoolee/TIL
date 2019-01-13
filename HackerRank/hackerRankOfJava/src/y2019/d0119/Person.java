package y2019.d0119;

import java.util.Scanner;

public class Person {
	
//	1. 기본적으로 해야 할 구성 요소
//	* Scanner 클래스 이용하기
		Scanner scan = new Scanner(System.in);
//		1.1.1. 이름
		String personName = scan.nextLine();
//		1.1.2. 키
		int personHeight = scan.nextInt();
//		1.1.3. 학력
		String personEducation = scan.nextLine();
//		1.1.4. 포폴
		String personPortfolio;
		
//		1.2. 각 이름 키 학력 카테고리 별 합계의 크기
		int PERSONDATA = 3;
		
		void personalInformation(String personName, int personHeight, String personEducation) {	
//			1. for문을 이용해 이름과 키 그리고 학력을 출력한다.
		for(int i = 0; i < PERSONDATA+1; i++) { 
			System.out.println("이름 : "+personName+"키 : " + personHeight + "학력 : " + personEducation);
			}
		}
		
//		2. 포폴 이름(메소드로)
		String portfolio() {
//		- 포폴 내 구성해야 할 기능들
//			2.1. 프로젝트 이름
			System.out.print("프로젝트 명 : ");
			String projectName = scan.nextLine();
//			2.2. 프로젝트 목표
			System.out.println("프로젝트 "+ projectName +"프로젝트의 목표는" + scan.nextLine()+" 입니다.");
//			2.3. 프로젝트 사용 도구 뭔가 외부 파일에서 호출하는게 낫지 않음?
			
//			2.4. 프로젝트 구성 요소
		return personPortfolio;		
		}
}