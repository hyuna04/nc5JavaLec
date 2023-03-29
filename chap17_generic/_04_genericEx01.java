package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList =
				new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i+1);
		}
		
		System.out.println(_04_genericEx01.
				<Integer>getEven(intList));
		System.out.println(getEven(intList));
	}

	//Number상속받는 T
	//리턴타입 List<T> getEven(List<T> list)
	
	public static <T extends Number> List<T> 
	getEven(List<T> list) {
		List<T> nList = new ArrayList<>();
		
		for(T t : list) {
			if(t.intValue()%2 == 0) {
				nList.add(t);
			}
		}
		
		return nList;
	}
//이 코드는 입력으로 주어진 List<티>에서 짝수인 원소들만을 추출하여
//	새로운 List<T>를 생성하여 반환하는 메서드입니다.
//
//제네릭 타입 매개변수 T는 Number 클래스 또는 그 하위 클래스들 중 하나를 상속받은 타입으로 제한됩니다. 
//	따라서 이 메서드는 정수형 (Byte, Short, Integer, Long) 및 실수형 (Float, Double) 값이 포함된 리스트를 다룰 수 있습니다.
//
//메서드 내부에서는 입력 리스트에 대해 for-each 루프를 돌면서 각 원소가 짝수인지 검사합니다. 
//	이를 위해 Number 클래스에서 제공되는 intValue() 메서드를 호출하여 해당 값을 정수형으로 변환하고, 
//	이를 2로 나누어 나머지가 0인지를 확인합니다. 짝수인 경우 새로운 리스트에 추가합니다.
//
//마지막으로 새로운 리스트를 반환합니다.




	
	
}
