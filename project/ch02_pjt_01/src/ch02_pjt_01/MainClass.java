package ch02_pjt_01;

public class MainClass {

	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();
		//클래스 사용할 때 항상 생정자로 호출해서 객체 생성해줘야함
		calculator.calAdd(10,5);//calculator 내부에 메소드가 있다고 가정을하고 작성
		calculator.calSub(10,5);
		calculator.calMul(10,5);
		calculator.calDiv(10,5);
	}
}
