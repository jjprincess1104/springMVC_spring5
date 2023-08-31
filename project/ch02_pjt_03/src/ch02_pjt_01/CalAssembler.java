package ch02_pjt_01;

import java.util.Scanner;

public class CalAssembler {
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	CalMod calMod;
	
	public CalAssembler() {
		calculator = new MyCalculator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv();
		calMod = new CalMod();
		
		assemble();
	}
	
	public void assemble() {
		System.out.println("숫자입력");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		calculator.calculate(num1, num2, calAdd);
		calculator.calculate(num1, num2, calSub);
		calculator.calculate(num1, num2, calMul);
		calculator.calculate(num1, num2, calDiv);
		calculator.calculate(num1, num2, calMod);
	}
}
