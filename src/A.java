
public class A {//외부 클래스 A
	
	A() {System.out.println("A생성자 호출");}
	
	/* 인스턴스 멤버 내부클래스 : 외부클래스명$내부클래스명.class(A$B.class) */
	public class B{
		/* 인스턴스 멤버 내부클래스에는 인스턴스 변수와 메서드만 올 수 있다.
		 * 정적변수와 정적메서드는 올 수 없다.
		 * 
		 */
		B(){System.out.println("B생성자 호출");}
		int field01; //인스턴스변수
		//static int field02; //정적변수는 올 수 없다.
		void method01() {}//인스턴스 메서드 올 수 없다.
		//static void method02() {} //정적 메서드 올 수 없다.
	}//B class
	
	/* 정적 멤버 내부 클래스 */
	static class C{
		/* 정적 멤버 내부클래스에는 인스턴스 변수, 인스턴스 메서드, 정적변수, 정적메서드 모두 올 수 있다.
		 * 
		 */
		C(){
			System.out.println("C생성자 호출");
		}
		int field01;
		static int field02;
		void method01() {}
		static void method02() {}
	}//C class
	
	void method() {
		/*로컬 지역클래스 : 외부클래스$1내부클래스명.class
		 */
		class D{
			D(){System.out.println("D생성자 호출");}
			
			/* 로컬 지역 클래스에는 인스턴스 변수와 인스턴스 메서드는 올 수 있다.
			 * 정적변수와 정적메서드는 올 수 없다.
			 */
			int field01;
			//static int field02;
			void method01() {}
			//static void method02() {}
			
		}
		D d = new D();
		d.field01=3;
		d.method01();
	}//method()

}
