package ch02_pjt_01;

public class MyCalculator {
	
	/*메서드만들어주기*/
	public void calAdd(int fNum, int sNum) {
		ICalculator calculator = new CalAdd();
		//인터페이스 형태로 선언하되 만들어주는 애는 calAdd
		//상위형 변환이 알아서 일어나고있는것?
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : "+ value);
	}
	
	public void calSub(int fNum, int sNum) {
		ICalculator calculator = new CalSub();
		//인터페이스 형태로 선언하되 만들어주는 애는 calAdd
		//상위형 변환이 알아서 일어나고있는것?
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : "+ value);
	}
	
	public void calMul(int fNum, int sNum) {
		ICalculator calculator = new CalMul();
		//인터페이스 형태로 선언하되 만들어주는 애는 calAdd
		//상위형 변환이 알아서 일어나고있는것?
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : "+ value);
	}
	
	public void calDiv(int fNum, int sNum) {
		ICalculator calculator = new CalDiv();
		//인터페이스 형태로 선언하되 만들어주는 애는 calAdd
		//상위형 변환이 알아서 일어나고있는것?
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : "+ value);
	}
}
