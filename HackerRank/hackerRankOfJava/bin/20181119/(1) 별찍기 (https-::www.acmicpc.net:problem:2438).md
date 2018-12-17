      /*
       첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
       */

      // step 1: 콘솔창에 n개 입력 받는다.
      // step 2: n은 콘솔창에 찍힌 범위까지만 출력한다.
      // step 3: *의 값이 +1씩 증가하면서 쌓아나간다.
"
 // 콘솔창에 num개를 입력받는 Scanner()메소드 sc를 할당한다.
 Scanner sc = new Scanner(System.in);

 // star라는 스트링 타입 변수 선언하고 "*"을 할당한다.
 String star = "*";

 // 정수형 타입 num은 sc클래스의 nextInt()메소드를 호출한다.
 int num = sc.nextInt();
 sc.close();

 // 정수형 타입 i가 1부터 시작해 num이 i보다 같거나 작을 때까지 i를 +1씩 증가한다.
 for(int i = 1; i <= num; ++i) {
   // i의 값이 +1씩 증가하면서 별이 한개씩 더 찍힌다.
   // 어떻게 하면 2개가 찍힐까? 그리고 3개가 찍힐까? 쌓는다 ... 저장하는 방법은 뭐지?!
// 정수형 타입 j가 1에서 j가 i보다 같거나 작을 때까지 j를 ++1씩 증가하면서 문자열 *이 쌓인다.
// 처음 i는 1이기에 바로 star를 출력하고 줄바꿈을 해주는 메소드로 넘어간다.
for(int j = 1; j <= i; ++j) {
System.out.print(star);
  }
// 1~5까지 줄바꿈을 해준다.
System.out.println();
}
"
