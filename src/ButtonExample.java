
public class ButtonExample {
	public static void main(String[] args) {
		
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener()); //업캐스팅+매개변수 다형성
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());		
		btn.touch();
		
	}
}
