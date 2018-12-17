package y2018.d1119;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FirstExam {


    public static void main(String args[]){

    	Scanner scanner = new Scanner(System.in);
    	//배열로 5개의 정수 입력받기
//    	int SIZE = 5;
//    	System.out.println(SIZE);
    	int[] arr = new int[5];
    	List<Integer> list = new ArrayList<Integer>();
    
    	//SIZe -> arr.length / list.size();
    	
    	
    	for(int i=0; i<5; i++) {

    		arr[i] = scanner.nextInt();

    	}
//    	for(int i=0; i<5; i++) {
//    		System.out.println(arr[i]);
//    	}
//
//    	System.out.print(arr);
    	//최대값 찾기 ==> 문제: 최쏘값찾기
    	int large = arr[0]; // large 값을 0으로 할당 <- 0, 1 3 -5 , 
    	int small = arr[0];
    	int sum = 0;
    	float avg = 0;
    	
    	for(int i=1; i<5;i++) {

    		System.out.println("index:"+i+", large:"+large+ ", arr[i]:"+arr[i]);
    		if(large < arr[i]) {
    			System.out.println(large +"<"+ arr[i]);
    			large = arr[i];
    		
    		}
    		
    		System.out.println("index:"+ i + ", small:"+ small + ", arr[i]:" +arr[i]);
    		if( small > arr[i]) {
    			System.out.println(small + ">" + arr[i]);
    			small = arr[i];
    		}
    		
    		// averge 만들기
    		// 각 배열 값들의 평균 구하기
    		
    		// sum 만들기
    		for(int i1 = 0; i1 < arr.length; i1++) {
    			sum = sum + arr[i];
    		}
    			avg = sum / arr.length;
    	}

    

    	System.out.print("입력값 : ");
    	for(int i=0; i<5; i++) {
    		System.out.print(arr[i]+", ");
    	}
    	System.out.println(" ");
    	System.out.println("최대값은 "+large+", 최소값은 "+small +"입니다");
    }

}