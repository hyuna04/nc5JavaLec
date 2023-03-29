package chap12_nestedclass;

public class _02_instanceOfNestedClass {
	
	public static void main(String[] args) {
		//외부 클래스 객체 생성
		NestedClass nc = new NestedClass();
		//1. 인스턴스 클래스의 객체 생성
		NestedClass.Mul mul = nc.new Mul();
		//2. 정적중첩 클래스의 객체생성
		NestedClass.Div div = nc.new Div();
		//3-1.정적 중첩 클래스의 정적멤버에 접근
		System.out.println(NestedClass.Div.Result);
		//3-2.정적 중첩 클래스의 일반멤버에 접근
		System.out.println(div.getNum3);
		
		//4. 인스턴스 중첩 클래스의 객체 사용
		mul.setNum1(150);
		mul.setNum1(15);
		System.out.println(mul.getNum() * mul.gerNum2);
		System.out.println(mul.getResult());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		