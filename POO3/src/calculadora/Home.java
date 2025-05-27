package calculadora;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//criar objeto
		Calculadora cal = new Calculadora();
		System.out.println("Num1: ");
		cal.num1 = sc.nextDouble();
		System.out.println("Num2: ");
		cal.num2 = sc.nextDouble();
		
		System.out.println("Soma: " +cal.soma());
		System.out.println("Subtração: " + cal.subtrair());
		
		sc.close();

	}

}
