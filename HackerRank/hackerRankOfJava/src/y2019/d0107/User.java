package y2019.d0107;

public class User {
	
	String userName;
	int level;
	
	public User() {
		this("깜따긔야", 99);
		System.out.println("자동 생성");
	} // 생성자(Constructer)
	
	public User(String userName) {
		this.userName = userName;
		System.out.println("유저이름은 :" + userName);
	}
	
	public User(String userName, int level) {
		this.userName = userName;
		this.level = level;
		System.out.println(userName + "," + level);
	}
	
//////////////////////////////////////////////////
	
	void setUserName(String userName) {
		this.userName = userName;
		userName = "깜따긔야";
// API는 남들이 만든 메소드이다!
	}
	
	String getUserName() {
		return userName;
	}
}
