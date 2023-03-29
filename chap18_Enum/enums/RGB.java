package chap18_Enum.enums;

public enum RGB {
	//상수명 RED("red", 255, 0, 0), 
	//	   GREEN,  
	//	   BLUE
	
//	1. RED("red", 255, 0, 0), GREEN("green", 0, 255, 0), BLUE("blue", 0, 0, 255);
//
//	2. ("red", 255, 0, 0(String, int, int, int)순서대로 값 지정해주기)
//	private String color; 
//	private int red;
//	private int green;
//	private int blue;
//
//	// 생성자 선언 -> 값을 집어넣어주기 위해 (헷갈리지않게)클래스명과 같은이름으로 생성자명 선언
//	RGB(String color, int red, int green, int blue) {
//		this.color = color; // -> color은 1의 값을 의미 this.color은 2의 값을 의미(헷갈리지않게 this.을 넣어줬다고 생각하기ㅣ..)
//		this.red = red;
//		this.green = green;
//		this.blue = blue;
//	}
	
	RED("red", 255, 0, 0),
	GREEN("green", 0, 255, 0),
	BLUE("blue", 0, 0, 255);
	
	private String comorStr;
	private int red;
	private int green;
	private int blue;
	


	private RGB(String comorStr, int red, int green, int blue) {
		this.comorStr = comorStr;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}



	public String getComorStr() {
		return comorStr;
	}



	public int getRed() {
		return red;
	}



	public int getGreen() {
		return green;
	}



	public int getBlue() {
		return blue;
	}
	
	
	
}