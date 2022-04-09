package week4.day2;

public class Automation extends MultipleLangauge implements TestTool{
	public void sel() {
		// TODO Auto-generated method stub
		System.out.println("its selenium");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation auto=new Automation();
		auto.selenium();
		auto.java();
		auto.ruby();
		auto.python();
		
	}
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("its java");
		
	}
	public  void ruby() {
		System.out.println("Its Ruby");
		
	}
	public void selenium() {
		// TODO Auto-generated method stub
		
	}
	

}
