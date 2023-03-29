package chap09_polymorphism;

import chap09_polymorphism.product.TV;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성을 사용하지 않고 Tv 바꾸기
		TV tv = new Lgtv();
		//SamsungTv tv = new SamsungTv();
		
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();
		
		System.out.println(tv.toString());
	}

}
