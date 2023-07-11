//익명 클래스 활용 예제
public class AnonymousExample {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method01();
		
		anony.method02(new Person() {
			void study() {
				System.out.println("자바 공부를 합니다.");
			}
			

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
			
			
			
		});//메서드 인자값으로 익명클래스 문법처리 => AnonymousExample$1.class로 컴파일
	}
}
