package chap15_usefulClass;

import java.util.ArrayList;
import java.util.List;

public class _03_String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String atr1 = "computer";
		String str2 = "smartPhone";
		String str3 = "abcdhadecba";
		
		if(str1.contains("tP")) {
			System.out.println("str1은 tP를 포함합니다.");
		} else {
			System.out.println("str1은 tP를 포함하지 않습니다.");
		}
		
		//해당 문자나 문자열의 인덱스 확인
		int index1 = str2.indexOf('h');
		int index2 = str3.indexOf('a', 4);
		int index3 = str3.indexOf("abc");
		
		int index4 = str3.indexOf('h');
		int index5 = str3.indexOf('a', 7);
		int index51 = str3.indexOf("bc");
		
		//문자열 길이
		int[] intArr = new int[10];
	    System.out.println(intArr.length);
		
		
		System.out.println("str의 길이는 " + intArr.length + "입니다.");
		
		List<Integer> intList = 
				new ArrayList<Integer>();
		intList.add(1);
		intList.add(1);
		intList.add(1);
		intList.add(1);
		System.out.println(intList.size());
		
		//replace, replaceAll(정규직 사용가능)
		String str4 = "abc"
				+ "abc"
				+ "abc"
				+ "aabbcc";
		
		System.out.println(str4.replace("abc", "111"));
		//[]안의 문자를 전부 치환한다.
		System.out.println(str4.replaceAll("[ac]", "222"));
		System.out.println(str4.replace('a', '1')
							   .replace('b', '2')
							   .replace('c', '3'));
		
	}

}
