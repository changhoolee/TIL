package y2018.d1210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pratice4();
	}
	
	public static void pratice3() {
		
		Scanner sc = new Scanner(System.in);
		
		int [] list = new int [10];
		
		for(int i = 1; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(list));
	}
	
	public static void pratice4() {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Integer> list = new ArrayList <> ();
		
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		
		Integer [] index = list.toArray(new Integer[6]);
		
		for(int i = 0; i < index.length; i++) {
			System.out.println(index[i]);
		}
	}
}