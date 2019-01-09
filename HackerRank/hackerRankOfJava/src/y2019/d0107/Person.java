package y2019.d0107;

class Person {
	
	// 1. Data
	
	// Instance variables
	String name = "Rin";
	String bloodType;
	int age = 20;
	
	// 2. Method
	
	void speak(String name, String bloodType) {
		System.out.println("저의 이름은 " + name + "이고 혈액형은 " + bloodType + "입니다.");
	}
	
//  01. String 타입에 getName()메소드를 생성하고 이 메소드는 앞서 String 타입에 인스턴스 변수 name의 "Rin"을 준다.
	String getName() {
		
		return name;
		
	}
	
	int getAge() {
		
		return age;
	}
}