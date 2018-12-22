package y2018.d1217;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		/*
		US: formattedPayment
		India: formattedPayment
		China: formattedPayment
		France: formattedPayment
		
		콘솔 : 12324.134
		
		US: $12,324.13£
		India: Rs.12,324.13
		China: ￥12,324.13
		France: 12 324,13 €
		*/
		// 콘솔창에 생성
		// 소수점, ,표시를 몇번째 자리에 추가할 것인가? - NumberFormat 클래스
		// 공통점으로는 if(us < 10000000)이면 끝에 한 자리를 지운다.  - getCurrencyInstance() 
		// us의 경우 $표시하고 10000 자리에 ,를 표시하고 100자리에 .을 찍는다.
		
		Scanner scan = new Scanner(System.in);
		
		double value = scan.nextDouble();
		
		scan.close();
		
		Locale indiaLocale = new Locale("en", "IN");
		Locale korLocale = new Locale("kor", "KR");
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US); // 지금 내가 클래스랑 객체를 햇갈리는건가?
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		// All 역활을 하는 클래스가 없을까? NumberFormat을£ 담는...?
		
		System.out.println("US : " + us.format(value));
		System.out.println("INDIA : " + india.format(value));
		System.out.println("CHINA : " + china.format(value));
		System.out.println("FRANCE : " + france.format(value));
	}
}
