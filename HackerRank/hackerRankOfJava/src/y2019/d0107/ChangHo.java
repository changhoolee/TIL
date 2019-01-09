package y2019.d0107;

public class ChangHo {
	
	String bloodType;

//	String bloodType;
//	int male_tall;
//	int male_age;
//	
//	String address;
//	String addressSpefic;
//	int homeNumber;
	
	public ChangHo() {
		System.out.println("하하!");
	}
	
	public ChangHo(String bloodType) {
		this.bloodType = bloodType;
		System.out.println(bloodType);
	}
	
	void setChangHoName(String bloodType) {
		this.bloodType = bloodType;
	}
	
	String getChangHoName() {
		return bloodType;
	}
	
//	public String bloodType(String bloodType) {
//		this.bloodType = bloodType;
//		return "A형";
//	}

//	int tall(int male_tall) {
//		this.male_tall = male_tall;
//		return +2;
//	}
//	
//	void setAddressProfile(String address, String addressSpefic, int homeNumber) {
//		this.address = address;
//		this.addressSpefic = addressSpefic;
//		this.homeNumber = homeNumber;
//		address = "경기도 고양시 마두2동";
//		addressSpefic = "우방아파트 806동 10000호";
//		homeNumber = 823;
//	}
//	
//	String getAdderessProfile() {
//		
//		return address;
//		
//	}
}
