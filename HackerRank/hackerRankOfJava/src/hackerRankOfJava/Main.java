package hackerRankOfJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;   
public class Main {  
    public static void main(String args[]){  
       
    	
    	
    	Scanner scanner = new Scanner(System.in);
    	//배열로 5개의 정수 입력받기
    	int SIZE = 5;
    	System.out.println(SIZE);
    	int[] arr = new int[5];
    	for(int i=0; i<5; i++) {
    		
    		arr[i] = scanner.nextInt();
    	
    	}
//    	for(int i=0; i<5; i++) {
//    		System.out.println(arr[i]);
//    	}
//    	
//    	System.out.print(arr);
    	//최대값 찾기 ==> 문제: 최쏘값찾기 
    	int large = arr[0]; // large 값을 0으로 할당
    	
    	for(int i=1; i<5;i++) {
    		
    		System.out.println("index:"+i+", large:"+large+ ", arr[i]:"+arr[i]);
    		if(large < arr[i]) {
    			System.out.println(large +"<"+ arr[i]);
    			large = arr[i];
    		}
    	}
    	
    	
    	// 최소값 찾기
    	int small = arr[0];
    	
    	for(int i = 1; i < 5; i++) {
    		
    		System.out.println("index:"+ i + ", small:"+ small + ", arr[i]" +arr[i]);
    		if(small > arr[i]) {
    			System.out.println(small + ">" + arr[i]);
    			small = arr[i];
    		}
    	}
    	
    	System.out.print("입력값 : ");
    	for(int i=0; i<5; i++) {
    		System.out.print(arr[i]+", ");
    	}
    	System.out.println(" ");
    	System.out.println("최대값은 "+large+", 최소값은 "+small +"입니다");
    	//List<Integer> list = new ArrayList<Integer>();s
    	//int n1, n2, n3, large, small; // 숫자 및 최대/최소값 초기화  
       // float average; // 평균 초기화  
        
//        Scanner kbd=new Scanner(System.in);  
//        // 숫자 입력 받는 부분  
//        System.out.print("첫번째 숫자: ");  
//        n1=kbd.nextInt();
//        System.out.print("두번째 숫자: ");  
//        n2=kbd.nextInt();  
//        System.out.print("세번째 숫자: ");  
//        n3=kbd.nextInt();  
        // 큰 수 구하기  
//        large=n1;
//        if(n2>large) large=n2;  
//        if(n3>large) large=n3;
        
//    	for(int large1 = n1; large1 < n2; ++large1) {
    		
//    	}
    	
//        // 작은 수 구하기  
//        small=n1;  
//        if(n2<small) small=n2;  
//        if(n3<small) small=n3;         
//        // 평균 구하기  
//        average=(float)((n1+n2+n3)/3.0);  
//        // 출력  
//        System.out.println("\n평균값: "+average);  
//        System.out.print("\n최대값: "+large);   
//        System.out.print("\n최소값: "+small);  
//        
//        //String to Integer
//        Integer.valueOf("3");
//        Integer.parseInt("3");
      
    }

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}  
}