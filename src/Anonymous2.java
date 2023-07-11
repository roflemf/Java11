//익명클래스 생성
public class Anonymous2 {

	//필드 즉 멤버변수 초기값으로 설정하는 익명 문법
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	};//첫번째 익명클래스 문법 => Anonymous2$1.class 로  컴파일
	
	void method01() {
		//로컬 지역변수 값으로 설정되는 익명클래스문법
	
		RemoteControl LocalVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("유튜브를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("유튜브를 끕니다.");
			}
		};//두번째 익명클래스 문법 => Anonymous2$2.class
		
	}//method01()
	
	void method02(RemoteControl rc) {
		rc.turnOn();
		
	}
	
}
