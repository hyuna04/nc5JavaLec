package chap15_usefulClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _24_simpleDateFormat {

	private static Date today;
	private static Date Date;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));

	}

}
