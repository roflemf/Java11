
public class AnonymousExample2 {
	public static void main(String[] args) {
		
		Anonymous2 anoy = new Anonymous2();
		anoy.field.turnOn();
		anoy.method01();
		
		anoy.method02(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트 TV를 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트 TV를 끕니다");
			}
		});//익명 클래스 문법
	}

}
