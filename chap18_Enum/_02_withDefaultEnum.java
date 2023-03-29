package chap18_Enum;

import chap18_Enum.enums.DefaultMonth;

public class _02_withDefaultEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DefaultMonth형의 변수선언
		//DefaultMonth.JAN을 값으로 갖는
		//DefaultMonth의 열거형 객체가 하나 생성
		DefaultMonth jan = DefaultMonth.JAN;
		
		//DefaultMonth의 열거형 객체의 이름(상수이름)
		//=>JAN
		System.out.println(jan);
		System.out.println(jan.ordinal());
		System.out.println(DefaultMonth.AUG);
	}

}
