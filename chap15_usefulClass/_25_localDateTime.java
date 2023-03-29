package chap15_usefulClass;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class _25_localDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2023, 3, 24);
		LocalDate time = LocalDateTime.of(16, 4, 30);
		
		//of메소드를 이용한 LocalDateTime객체 생성
		LocalDateTime ldt1 = LocalDateTime.of(date, time);
		
		//atDate, atTime 메소드 사용
		LocalDateTime ldt2 = LocalDateTime.of(time);
		LocalDateTime ldt3 = LocalDateTime.of(date);
		
		//현재 날짜와 시간의 LocalDateTime객체 생성
		LocalDateTime ldt4 = LocalDateTime.now();
		
		//LocalDateTime -> LocalDate, LocalTime 분리
		LocalDate 1d = ldt3.tiLocalDate();
		LocalTime 1t = ldt3.tiLocalDate();
		
		System.out.println(ldt1);
		System.out.println(ldt2);
		System.out.println(ldt4);
		System.out.println(ld + "," + 1t);
		
	}

}
