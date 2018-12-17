package y2018.d1207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		int age = sc.nextInt();
//		float avg = sc.nextFloat();
//		
//		System.out.println("당신의 이름과 나이와 평균 점수는?" + name + age + avg);
		
//		int [] arr = {5, 2, 3, 4};
//		System.out.println(Arrays.toString(arr));
		
//		int [] a1 = {10, 20, 30, 40, 50};
//		
//		for(int i = 0; i < a1.length; i++) {
//			System.out.println(a1 [i]);
//		}
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(new Integer(10));
//		list.add(new Integer(20));
//		list.add(new Integer(30));
//		list.add(new Integer(40));
//		
//		System.out.println(list.toString());
		
		
		//여기서 리스트를 생성하는 부분이 어디있죠? 
		Scanner listSt = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 이건 이미 리스트 값에 10, 20, 30을 설정한거죠?
		// 넵 
		list.add(3); // add안에 리스트에 추가하고 싶은 값을 넣으면 되겠죠?
		//Scanner에서 입력받고 싶으면 sc.nextInt()를 넣으면 될거고 
		//모범 답안이랄게 .. 리스트에 뭘 넣고 싶은지에 따라 다르니까요'--' 
		//
		list.add(20); // 숫자는 굳이 new 뭐 이런거 안해도 돼요 넵!
		list.add(new Integer(30));
		
		
		int size = list.size();
		for(int i = 0; i < size; i++) {
			System.out.println(list.get(i)+ " ");
		}
		
//		
//		String[] names = new String[5];
//		int sizes = names.length;
//		
//		Scanner put = new Scanner(System.in);
//		
//		for(int i = 0; i < sizes; i++) {
//			System.out.print("이름을 입력하세요");
//			names[i] = put.next();
//		}
//		
//		for(int i = 0; i < sizes; ++i) {
//			System.out.println("이름 : " + names[i]);
//		}
		
	}

}
