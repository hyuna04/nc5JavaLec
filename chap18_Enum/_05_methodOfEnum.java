package chap18_Enum;

import java.lang.reflect.Method;

import chap18_Enum.enums.methodMonth;

public class _05_methodOfEnum {
public static void main(String[] args) {
	MethodMonth.printMonth(5);
	
	methodMonth aug = methodMonth.AUG;
	aug.printMonth(3);
	aug.printMonth(36);
	
}
}
