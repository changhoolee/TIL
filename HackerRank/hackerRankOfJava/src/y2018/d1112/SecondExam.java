package y2018.d1112;

import java.util.Scanner;

public class SecondExam {

    public static void main(String[] args) {
        // 콘솔창에 입력하기 위한 클래스를 할당한다.
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); // scan에 nextInt 메소드는 콘솔창에 정수형 타입만 오고 정수형 타입 i에 할당한다.
        double d = scan.nextDouble(); // scan에 nextDouble 메소드는 콘솔창에 double 타입만 오고 정수형 타입 d에 할당한다.
        scan.nextLine(); // 민정님 nextLine()메소드는 왜 String s = scan.nextLine();이 안되는건가요?
        String s = scan.nextLine(); // 문자열을 콘솔창에 그대로 출력하는 nextLine()메소드를 String s에 할당한다.

        // 각각 문자열, 실수, 정수 타입의 결과를 출력한다.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
}
}
