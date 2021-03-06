package y2018.d1112;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FirstExam {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Scanner의 sc클래스를 만든다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수형 타입 n은 sc클래스의 nextInt()메소드를 가진다.
        String ans= ""; // 왜 문자열타입에 ans을 선언하고 ""빈공백을 할당한다.
        // 문제에 나와있는 if문을 이용한 조건식을 완성한다.
        if(n%2==1 || ((n%2==0) && (n>=6 && n <= 20))) { //
            ans = "Weird"; // n%2==1 이거나 ((n%2==0) && (n>=6 && n <= 20))이면 ans는 "Weird"를 할당한다.
        }
        else // 이게 If  is even and in the inclusive range of  to , print Not Weird에 해당된다.
        {
                ans="Not Weird"; // 위에 모든 조건을 만족하지 않으면 ans는 "Not Weird"를 할당한다.
        }

        System.out.println(ans); // 두 조건들 중 하나인 ans 를 출력한다.
    }
}
