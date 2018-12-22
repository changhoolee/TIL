package y2018.d1222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pratice02 {

	public static void main(String[] args) {
		
		pratice04();
		
		pratice03();
	}
	
	public static void pratice03() {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList <Integer> myList = new ArrayList <Integer> ();
		
		while(scan.hasNext()) {
			myList.add(scan.nextInt());
		}
		System.out.println(myList);
	}
	
	public static void pratice04() {
		
		Scanner scan = new Scanner(System.in);
		
		int scanToInt = Integer.parseInt(scan.nextLine());
		
		int [] list = new int [scanToInt];
		
		for(int i = 0; i < list.length; i++ ) {
			list [i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(list));
	}
}