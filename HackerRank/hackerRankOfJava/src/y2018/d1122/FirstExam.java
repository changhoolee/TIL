package y2018.d1122;

import java.util.Scanner;

public class FirstExam {

	public static void main(String[] args) {
		/*
		별찍기 2 (https://www.acmicpc.net/problem/2440)
		 */
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int end = 0;
		for(int i = number; i > end; --i) {
			for(int j = 0; j < i; ++j) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}