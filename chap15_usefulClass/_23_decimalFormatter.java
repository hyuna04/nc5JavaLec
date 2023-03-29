package chap15_usefulClass;

import java.util.Date;

import javax.swing.text.DateFormat;

public class _23_decimalFormat{

	private static Date price2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.text.DateFormat df = 
				new decimalFormat("###,###");
		
		int price1 = 100000;
		int price2 = 1000000000;
		
		System.out.println(df.format(price1));
		System.out.println(df.format(price2));

	}

}
