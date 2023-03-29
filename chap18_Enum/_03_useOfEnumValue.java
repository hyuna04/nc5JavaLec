package chap18_Enum;

import chap18_Enum.enums.ValueMonth;
import chap18_Enum.enums.ValueMonth;

public class _03_useOfEnumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enum의 객체를 만들 떄 생성자가 자동으로 호출
		//호출한 상수값이 생성자의 매개변수로 들어가서
		//선언되어있는 변수에 대입된다
		ValueMonth mar = ValueMonth.MAR;
		
		System.out.println(mar.getMonthVal());
		
		// 여러 형태의 enum객체 생성
		ValueMonth jan = ValueMonth.JAN;
		ValueMonth feb = ValueMonth.valueOf("FEB");
		ValueMonth apr = Enum.valueOf(ValueMonth.class, "APR");
		
		System.out.println("jan : " + jan);
		
		//enum 객체배열
		ValueMonth[] vmArr = ValueMonth.values();
		for(ValueMonth v : vmArr) {
			System.out.println(v.name() + "은" + v.ordinal() + "인덱스에 있습니다.");
		}
	}

}
