package chap18_Enum.enums;

import java.lang.reflect.Method;

public enum methodMonth {
	JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
	 private int monthVal;

	    public int getMonthVal() {
	        return monthVal;
	    }
	    
	    
	    public void printMonth(int month) {
	    	methodMonth[] monthArr = values();
	    	for(int i = 0; i < monthArr.length; i++) {
	    		if(monthArr[i].getMonthVal() == month) {
	    			System.out.println("입력한 달은 " + monthArr[i].monthVal) + "월 입니다.");
	    		}
	    	}
	    }

	     public void printAddMonth(int month) {
	    	 if(this.getMonthVal() + month <= 12) {
	    		 System.out.println(month + "개월 뒤는 "
	    				 + this.getMonthVal() + month
	    				 + "월 입니다.");	
	    	 } else {
	    		 int remain = this.getMonthVal() + month - 12;
	    		 System.out.println(month + "개월 뒤는 "
	    				 + (JAN.monthVal + remain - 1)
	    				 + "월 입니다.");
	    	 }
	    }
}
