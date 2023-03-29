package chap15_usefulClass;

import java.math.BigInteger;

public class _15_bigInteger01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigInteger 객체생성
		BigInteger bint1 = new BigInteger("1000");
		BigInteger bit2 = BigInteger.valueOf(3000L);
		
		//타입변환
		String str = bint1.toString();
		int num = bint1.intValue();
		float fnum =  bint1.floatValue();
		
		//연산
		System.out.println(bint1.add(bit2));
		System.out.println(bint1.subtract(bit2));
		System.out.println(bint1.multiply(bit2));
		System.out.println(bint1.divide(bit2));
		System.out.println(bint1.remainder(bit2));

	}

}
