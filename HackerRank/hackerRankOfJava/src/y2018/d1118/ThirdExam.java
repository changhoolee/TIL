package y2018.d1118;

import java.util.Scanner;

public class ThirdExam {

public static void main(String[] args) {
	/*
	 * (3) 운전면허 시험 합격 여부를 판단하는 프로그램 만들기
	 */

	Scanner sc = new Scanner(System.in);
	// 콘솔에 '실기', 30 입력 

	String examName = sc.nextLine();
	int score = sc.nextInt();

	// next 1: 어떤 시험인가요? - 필기인 경우 - 60점 이상이면 “필기합격입니다. 실기 시험 보러가세요"
	if (examName == "필기" && score >= 60) {
		System.out.println("필기합격입니다. 실기 시험 보러가세요.");
	}
	else if(examName == "필기" && score < 60) {
		System.out.println("필기 다시 재시험을 보세요.");
	}
	// next 2: 어떻게 하면 실기에 해당되는 구문으로 넘어가서 다시 연산을 할 수 있을까? 혹시 while + if문?!
	else if(examName == "실기" && score >= 60) {
		System.out.println("합격입니다. 축하드립니다");
	} 
	else {
		System.out.println("다실기 시 재시험을 보세요.");
	}
  }
}