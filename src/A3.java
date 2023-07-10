
public class A3 {
	int field01; //인스턴스 변수
	void mehtod01() {} //인스턴스 메서드
	
	static int field02; //정적변수
	static void method02() {}//정적 메서드
	
	
	class B{ //인스턴스 멤버 내부 클래스
		void method01() {
			/* 인스턴스 멤버 내부클래스 메서드 내에서 
			 * 외부클래스의 인스턴스 변수, 인스턴스 메서드, 정적변수, 정적메서드에 접근할 수 있다.
			 */
			field01 = 10;
			method01();
			
			field02 = 20;
			method02();
			
		}
		
	}//B class
	
	static class C{ // 정적 멤버 내부 클래스
		
		void method02() {
			//field01=10; //외부클래스 인스턴스 변수 접근 못함
			//method01(); //외부클래스 인스턴스 메서드 접근 못함
			
			field02=20; // 정적 멤버 내부 클래스에서 외부클래스의 정적변수와 정적 메서드 접근 가능.
			method02();
		
		}
	}//C class
}
