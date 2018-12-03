package y2018.d1126;

import java.util.*; 
	
public class FirstExam {

      public static void main(String[] args) { 
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; // 문자열 타입의 배열 strArr은 "CHANGE"와 "LOVE" 등 4개의 원소를 가진 배열을 취한다.
            Scanner scan = new Scanner(System.in);  // 한번 생성해 놓고 재사용하면 되므로 반복문 밖으로 이동

            while(true) { // outer while문으로
                  String answer = getAnswer(strArr); // 스트링 타입의 answer은 getAnswer(매개변수로 문자열 타입의 배열 strArr)메소드를 할당한다.
                  String question = getScrambledWord(answer); // 스트링 타입의 question은 getScrambleWorld(매개변수 스트링 타입의 answer로 하는)메소드를 할당한다.
                  char[] hint = new char[answer.length()]; // char타입의 배열 형태인 hint는 answer의 총 길이를 저장하는 메소드를 배열 형태로 객체를 생성한다.

                  // hint를 '_'로 초기화 한다. 정답이 LOVE라면 hint는 "____"이 된다.
                  for(int i=0;i < hint.length;i++) {  // i < hint.length는 어떤 의미이지?! 
                        hint[i] = '_'; // for문이 들어간 이유는 '_'를 구분하기 위해?
                  } 

                  while(true) { // 가장 먼저 실행되는 반복문이다. 
                        System.out.println("Question :" + question);  
                        System.out.print("Your answer is :"); 

                        String input = scan.nextLine(); 

                        if(input.equalsIgnoreCase("q")) 
                              System.exit(0); 

                        if(input.equalsIgnoreCase(answer)) { 
                              System.out.println("정답입니다."); 
                              System.out.println(); 
                              break; 
                        } else { 
                              System.out.println(input+"은/는 정답이 아닙니다. 다시 시도해보세요.");       
                              System.out.println("Hint:"+getHint(answer,hint)); 
                        } 
                  } // while 
            } // outer while 

      } // main 

      public static String getAnswer(String[] strArr) { 
            int idx = (int)(Math.random()*strArr.length); 
            return strArr[idx]; 
      } 
      
      // 섞은 결과가 정답과 같은경우도 있을 수 있음. 복잡하지 않게... 그냥 간단히 
      public static String getScrambledWord(String str) { 
            char[] chArr = str.toCharArray(); 

            for(int i=0;i<chArr.length;i++) 

                 int idx = (int)(Math.random()*str.length()); 
                  
                  char tmp = chArr[i]; 
                  chArr[i] = chArr[idx]; 
                  chArr[idx] = tmp; 

            return new String(chArr); 
      }// scramble(String str) 

      public static String getHint(String answer, char[] hint) { 
            int hintCount = 0; // 힌트에 포함된 '_'의 개수
            
            for(int i = 0; i < hint.length; i++) {
            	
            	if(hintCount > 2) {
            	}
            	
            	char hint = (char) (Math.random()*hint.length);
            	System.out.println();
            }
            	
            	
            	

           // 1. 반복문을 이용해서 hint에 포함된 '_'의 개수를 센다.

           // 2. count의 값이 2보다 클 때만 정답의 한 글자를 hint에 넣는다.

           //    정답을 다 알려주는 상황이 되지 않게 하기 위함.


           //    [주의] 반드시 이전 힌트 보다 한글자를 더 보여줘야함.

           //    예를 들어 정답이 "LOVE"이고 이전 힌트가 "L___"이었다면

           //    그 다음 힌트는 "L__E"또는 "L_V_" 와 같은 식이어야 한다.

           //    Math.random()을 사용해서 정답의 한 글자를 골라서 힌트에 넣으면 된다.

      } // getHint() 
      }
      }