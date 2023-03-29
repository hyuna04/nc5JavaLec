package chap12_nestedclass.clazz;

public class NestedClass {
	//인스턴스 중첩 클래스
	class Mul {
		//static 변수나 메소드는 선언 불가
		//final static메소드는 상수라서 선언 가능
		public	int num1 = 10;
		public	int num2 = 20;
		
		public int getNum1() {
			return num1;
		}

		public void setNum1(int num1) {
			this.num1 = num1;
		}

		public int getNum2() {
			return num2;
		}

		public void setNum2(int num2) {
			this.num2 = num2;
		}

		int result = num1 * num2;
	}
	
	static class div {
		int num1 = 10;
		int num2 = 5;
		
		int result = num1/num2;
	}
}

	//정적 중첩 클래스
	// 외부클래스의 객체생성 없이도 접근 가능
	public static class Div {
		//static 변수나 메소드를 선언가능
		 int num3 = 10;
		 
		 public int getNum3() {
			return num3;
		}
		public void setNum3(int num3) {
			this.num3 = num3;
		}
		public int getNum4() {
			return num4;
		}
		public void setNum4(int num4) {
			this.num4 = num4;
		}
		int num4 = 5;
	}
























