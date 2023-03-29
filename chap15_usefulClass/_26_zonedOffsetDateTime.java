package chap15_usefulClass;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _26_zonedOffsetDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		
		//ZoneId 객체생성
		ZoneId zid = ZoneId.of("Asia/Seoul");
		
		//LocalDateTIme에 ZoneId추가해서
		//ZoneDateTime 객체생성
		ZonedDateTime zdt = ldt.atZone(zid);
		
		ZoneDateTime zdt1 = ldt.atZone(zid);
		
		ZonedDateTime zdt2 = ZoneDateTime.now();
						     .with
		//OffsetDateTime
		OffsetDateTime odt = zdt1.toOffDateTime();
						     
						     System.out.println(zdt1);
						     System.out.println(zdt2);
						     System.out.println(zdt3);
						     System.out.println(odt);
		
	}

}
