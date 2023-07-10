import java.util.Calendar;

/* 열거타입 Week 데이터 타입 활용 */

public class EnumWeekTest01 {
	public static void main(String[] args) {
		
		Week today = null; //열거 타입으로 today 변수 정의
		
		Calendar c = Calendar.getInstance();//Calendar는 추상클래스로 (new로)객체생성 못함
											//년월일시분초값을 반환할 때 많이 사용
		int week = c.get(Calendar.DAY_OF_WEEK); //일요일 1 ~ 토요일 7로 반환
		
		switch(week) {
			case 1: 
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
		}//switch ~ case문
		
		System.out.println("오늘 요일은 " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 여행을 떠난다");
		}else {
			System.out.println("자바를 열공 한다.");
		}
		
		
	}
}
