package chap18_Enum;

import chap18_Enum.enums.RGB;

public class _04_useOfRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB red = RGB.RED;
		RGB green = RGB.valueOf("GREEN");
		RGB blue = RGB.valueOf(RGB.class, "BLUE");
		
		System.out.println("빨간색은 " + red.getRed() + ", " + red.getRed());
		System.out.println("초록색은 " + green.getGreen() + ", " + green.getGreen());
		System.out.println("파랑색은 " + blue.getBlue() + ", " + blue.getBlue());
	}

}
